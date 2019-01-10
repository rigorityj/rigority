package main.rule.engine;

import java.util.ArrayList;
import java.util.List;

/**
 * The different types of "sources" accepted to examine.
 * <ul>
 * <li>JAR - A Jar file with or without external dependencies</li>
 * <li>APK - A Apk file with or without external dependencies</li>
 * <li>SOURCE - The source code of a Maven or a Gradle Project</li>
 * </ul>
 *
 * @author RigorityJTeam
 * @since V01.00.00
 */
public enum EngineType {
    //region Values
    JAR("JAR File", "jar", ".jar", "To signal a Jar File to be scanned."),
    APK("APK File", "apk", ".apk", "To signal a APK File to be scanned."),
    DIR("Directory of Source Code", "dir", "dir", "To signal the source directory of a Maven/Gradle Project."),
    JAVAFILES("Java File(s)", "java", ".java", "To signal a Java File(s) to be scanned."),
    CLASSFILES("Class File(s)", "class", ".class", "To signal a Class File(s) to be scanned.");
    //endregion

    //region Attributes
    private String name;
    private String flag;
    private String inputExtension;

    private String helpInfo;
    //endregion

    //region Constructor

    /**
     * The base constructor for the EngineType
     *
     * @param name - the human readable name of the engine type
     * @param flag - the flag used to identify the engine type
     */
    EngineType(String name, String flag, String extension, String helpInfo) {
        this.name = name;
        this.flag = flag;
        this.inputExtension = extension;
        this.helpInfo = helpInfo;
    }
    //endregion

    //region Getters

    /**
     * The getter for the flag
     *
     * @return string - the flag of the engine type
     */
    public String getFlag() {
        return this.flag;
    }

    /**
     * The getter for the human readable name of the engine type
     *
     * @return string - the name of the engine type
     */
    public String getName() {
        return this.name;
    }

    /**
     * The getter for the extension
     *
     * @return {@link java.lang.String} - The extension for the engine Type
     */
    public String getInputExtension() {
        return this.inputExtension;
    }

    /**
     * The getter for helpInfo
     *
     * <p>getHelpInfo()</p>
     *
     * @return {@link String} - Returns the HelpInfo field
     */
    public String getHelpInfo() {
        return helpInfo;
    }

    /**
     * The method to retrieve the engine type from the flag
     *
     * @param flag - the flag used to look for the specified engine type
     * @return - either null if no flag matched or the engine type
     */
    public static EngineType getFromFlag(String flag) {
        for (EngineType type : EngineType.values())
            if (type.inputExtension.equals(flag)) {
                return type;
            }
        return null;
    }

    /**
     * The method to automatically retrieve a list of the available flag types
     *
     * @return list string - the different available engine type flags
     */
    public static List<String> flagTypes() {
        List<String> flags = new ArrayList<>();
        for (EngineType type : EngineType.values())
            flags.add(type.flag);
        return flags;
    }

    /**
     * The method to automatically retrieve all of the help info for all of the different use cases.
     *
     * @return {@link String} - The full help info for console use
     */
    public static String getHelp() {
        StringBuilder out = new StringBuilder();

        for (EngineType type : EngineType.values())
            out.append(type.getFlag()).append(" : ").append(type.getHelpInfo()).append("\n");

        return out.toString();
    }
    //endregion
}
