package main.frontEnd.MessagingSystem.streamWriters.structures;

import main.frontEnd.MessagingSystem.AnalysisIssue;
import main.frontEnd.MessagingSystem.AnalysisLocation;
import main.frontEnd.MessagingSystem.routing.EnvironmentInformation;
import main.frontEnd.MessagingSystem.streamWriters.baseStreamWriter;
import main.rule.engine.EngineType;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>LegacyStream class.</p>
 *
 * @author RigorityJTeam
 * Created on 2/7/19.
 * @since 03.02.00
 *
 * <p>The Legacy stream writer.</p>
 * @version $Id: $Id
 */
public class LegacyStream extends baseStreamWriter {

    private final Boolean pretty = true;

    /**
     * <p>Constructor for LegacyStream.</p>
     *
     * @param info a {@link main.frontEnd.MessagingSystem.routing.EnvironmentInformation} object.
     */
    public LegacyStream(EnvironmentInformation info) {
        super(info);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void writeHeader(EnvironmentInformation info) {

        this.write("Analyzing " + info.getSourceType() + ": ");

        for (int sourceKtr = 0; sourceKtr < info.getSource().size(); sourceKtr++) {
            this.write(info.getSource().get(sourceKtr));

            if (sourceKtr != info.getSource().size() - 1)
                this.write(",");
        }
        this.newln();

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void streamIntoBody(AnalysisIssue issue) {
        writeln("=======================================", pretty);

        writeln("***Violated Rule " + issue.getRuleId() + ": " + issue.getRule().getDesc(), pretty);

        StringBuilder outputMessage = new StringBuilder();

        if (StringUtils.isNotBlank(issue.getClassName())) {
            outputMessage.append("***");
            if (!issue.getInfo().equals("UNKNOWN"))
                outputMessage.append(issue.getInfo());
            else
                outputMessage.append(issue.getRule().getDesc());
        } else {
            outputMessage.append("***Found: ");
            outputMessage.append("[\"" + issue.getInfo() + "\"] ");
        }

        //region Location Setting
        String lines = null;
        if (issue.getLocations().size() > 0) {

            List<AnalysisLocation> issueLocations = new ArrayList<>();
            for (AnalysisLocation loc : issue.getLocations())
                if (loc.getMethodNumber() == issue.getMethods().size() - 1)
                    issueLocations.add(loc);

            if (!issueLocations.isEmpty() && !issueLocations.toString().contains("-1"))
                lines = ":" + issueLocations.toString().replace("[", "").replace("]", "");

        }

        outputMessage.append(" in ").append(issue.getClassName());

        if (this.getType().equals(EngineType.DIR) || this.getType().equals(EngineType.JAVAFILES))
            outputMessage.append(".java");
        else if (this.getType().equals(EngineType.CLASSFILES))
            outputMessage.append(".class");

        outputMessage.append("::").append(issue.getMethods().pop());

        if (lines != null)
            outputMessage.append(lines);

        outputMessage.append(".");
        //endregion

        //endregion
        writeln(outputMessage.toString(), pretty);

        writeln("=======================================", pretty);
    }

    /** {@inheritDoc} */
    @Override
    public void writeFooter(EnvironmentInformation info) {

        //Only printing console output if it is set and there is output captured
        if (info.getInternalErrors() != null && info.getInternalErrors().split("\n").length >= 1) {
            writeln("=======================================", pretty);
            writeln("Internal Warnings: \n" + info.getInternalErrors(), pretty);
            writeln("=======================================", pretty);
        }


        //region Timing Section
        if (info.isShowTimes()) {
            writeln("=======================================", pretty);
            writeln("Analysis Timing (ms): " + info.getAnalyisisTime(), pretty);
            writeln("=======================================", pretty);
        }
        //endregion
    }
}