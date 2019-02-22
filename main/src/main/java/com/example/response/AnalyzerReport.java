//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.18 at 09:52:45 PM EST 
//


package com.example.response;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BugInstance" type="{https://www.swamp.com/com/scarf/struct}BugInstanceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BugSummary" type="{https://www.swamp.com/com/scarf/struct}BugSummaryType"/>
 *         &lt;element name="Metric" type="{https://www.swamp.com/com/scarf/struct}MetricType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MetricSummaries" type="{https://www.swamp.com/com/scarf/struct}MetricSummariesType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="assess_fw" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="assess_fw_version" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="assessment_start_ts" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="build_fw" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="build_fw_version" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="package_name" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="package_version" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="build_root_dir" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="package_root_dir" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="parser_fw" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="parser_fw_version" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="platform_name" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="tool_name" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="tool_version" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="uuid" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 * @author drmonster
 * @version $Id: $Id
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "bugInstance",
        "bugSummary",
        "metric",
        "metricSummaries"
})
@XmlRootElement(name = "AnalyzerReport")
public class AnalyzerReport {

    @XmlElement(name = "BugInstance")
    protected List<BugInstanceType> bugInstance;
    @XmlElement(name = "BugSummary", required = true)
    protected BugSummaryType bugSummary;
    @XmlElement(name = "Metric")
    protected List<MetricType> metric;
    @XmlElement(name = "MetricSummaries")
    protected MetricSummariesType metricSummaries;
    @XmlAttribute(name = "assess_fw")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String assessFw;
    @XmlAttribute(name = "assess_fw_version")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String assessFwVersion;
    @XmlAttribute(name = "assessment_start_ts", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar assessmentStartTs;
    @XmlAttribute(name = "build_fw")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String buildFw;
    @XmlAttribute(name = "build_fw_version")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String buildFwVersion;
    @XmlAttribute(name = "package_name", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String packageName;
    @XmlAttribute(name = "package_version", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String packageVersion;
    @XmlAttribute(name = "build_root_dir", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String buildRootDir;
    @XmlAttribute(name = "package_root_dir", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String packageRootDir;
    @XmlAttribute(name = "parser_fw", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String parserFw;
    @XmlAttribute(name = "parser_fw_version", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String parserFwVersion;
    @XmlAttribute(name = "platform_name", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String platformName;
    @XmlAttribute(name = "tool_name", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String toolName;
    @XmlAttribute(name = "tool_version", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String toolVersion;
    @XmlAttribute(name = "uuid", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String uuid;

    /**
     * Gets the value of the bugInstance property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bugInstance property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBugInstance().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.example.response.BugInstanceType}
     *
     * @return a {@link java.util.List} object.
     */
    public List<BugInstanceType> getBugInstance() {
        if (bugInstance == null) {
            bugInstance = new ArrayList<BugInstanceType>();
        }
        return this.bugInstance;
    }

    /**
     * Gets the value of the bugSummary property.
     *
     * @return a {@link com.example.response.BugSummaryType} object.
     */
    public BugSummaryType getBugSummary() {
        return bugSummary;
    }

    /**
     * Sets the value of the bugSummary property.
     *
     * @param value
     *     allowed object is
     *     {@link com.example.response.BugSummaryType}
     */
    public void setBugSummary(BugSummaryType value) {
        this.bugSummary = value;
    }

    /**
     * Gets the value of the metric property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metric property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetric().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.example.response.MetricType}
     *
     * @return a {@link java.util.List} object.
     */
    public List<MetricType> getMetric() {
        if (metric == null) {
            metric = new ArrayList<MetricType>();
        }
        return this.metric;
    }

    /**
     * Gets the value of the metricSummaries property.
     *
     * @return a {@link com.example.response.MetricSummariesType} object.
     */
    public MetricSummariesType getMetricSummaries() {
        return metricSummaries;
    }

    /**
     * Sets the value of the metricSummaries property.
     *
     * @param value
     *     allowed object is
     *     {@link com.example.response.MetricSummariesType}
     */
    public void setMetricSummaries(MetricSummariesType value) {
        this.metricSummaries = value;
    }

    /**
     * Gets the value of the assessFw property.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getAssessFw() {
        return assessFw;
    }

    /**
     * Sets the value of the assessFw property.
     *
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    public void setAssessFw(String value) {
        this.assessFw = value;
    }

    /**
     * Gets the value of the assessFwVersion property.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getAssessFwVersion() {
        return assessFwVersion;
    }

    /**
     * Sets the value of the assessFwVersion property.
     *
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    public void setAssessFwVersion(String value) {
        this.assessFwVersion = value;
    }

    /**
     * Gets the value of the assessmentStartTs property.
     *
     * @return a {@link javax.xml.datatype.XMLGregorianCalendar} object.
     */
    public XMLGregorianCalendar getAssessmentStartTs() {
        return assessmentStartTs;
    }

    /**
     * Sets the value of the assessmentStartTs property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar}
     */
    public void setAssessmentStartTs(XMLGregorianCalendar value) {
        this.assessmentStartTs = value;
    }

    /**
     * Gets the value of the buildFw property.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getBuildFw() {
        return buildFw;
    }

    /**
     * Sets the value of the buildFw property.
     *
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    public void setBuildFw(String value) {
        this.buildFw = value;
    }

    /**
     * Gets the value of the buildFwVersion property.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getBuildFwVersion() {
        return buildFwVersion;
    }

    /**
     * Sets the value of the buildFwVersion property.
     *
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    public void setBuildFwVersion(String value) {
        this.buildFwVersion = value;
    }

    /**
     * Gets the value of the packageName property.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getPackageName() {
        return packageName;
    }

    /**
     * Sets the value of the packageName property.
     *
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    public void setPackageName(String value) {
        this.packageName = value;
    }

    /**
     * Gets the value of the packageVersion property.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getPackageVersion() {
        return packageVersion;
    }

    /**
     * Sets the value of the packageVersion property.
     *
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    public void setPackageVersion(String value) {
        this.packageVersion = value;
    }

    /**
     * Gets the value of the buildRootDir property.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getBuildRootDir() {
        return buildRootDir;
    }

    /**
     * Sets the value of the buildRootDir property.
     *
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    public void setBuildRootDir(String value) {
        this.buildRootDir = value;
    }

    /**
     * Gets the value of the packageRootDir property.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getPackageRootDir() {
        return packageRootDir;
    }

    /**
     * Sets the value of the packageRootDir property.
     *
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    public void setPackageRootDir(String value) {
        this.packageRootDir = value;
    }

    /**
     * Gets the value of the parserFw property.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getParserFw() {
        return parserFw;
    }

    /**
     * Sets the value of the parserFw property.
     *
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    public void setParserFw(String value) {
        this.parserFw = value;
    }

    /**
     * Gets the value of the parserFwVersion property.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getParserFwVersion() {
        return parserFwVersion;
    }

    /**
     * Sets the value of the parserFwVersion property.
     *
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    public void setParserFwVersion(String value) {
        this.parserFwVersion = value;
    }

    /**
     * Gets the value of the platformName property.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getPlatformName() {
        return platformName;
    }

    /**
     * Sets the value of the platformName property.
     *
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    public void setPlatformName(String value) {
        this.platformName = value;
    }

    /**
     * Gets the value of the toolName property.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getToolName() {
        return toolName;
    }

    /**
     * Sets the value of the toolName property.
     *
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    public void setToolName(String value) {
        this.toolName = value;
    }

    /**
     * Gets the value of the toolVersion property.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getToolVersion() {
        return toolVersion;
    }

    /**
     * Sets the value of the toolVersion property.
     *
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    public void setToolVersion(String value) {
        this.toolVersion = value;
    }

    /**
     * Gets the value of the uuid property.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     *
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

}
