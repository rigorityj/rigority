//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.15 at 07:34:01 PM EST 
//


package com.example.response;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for BugCategoryType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="BugCategoryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="group" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *         &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bytes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 * @author RigorityJTeam
 * @version $Id: $Id
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BugCategoryType", propOrder = {
        "group",
        "code",
        "count",
        "bytes"
})
public class BugCategoryType {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String group;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String code;
    protected int count;
    protected Integer bytes;

    /**
     * Gets the value of the group property.
     *
     * @return possible object is
     * {@link java.lang.String}
     */
    public String getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     *
     * @param value allowed object is
     *              {@link java.lang.String}
     */
    public void setGroup(String value) {
        this.group = value;
    }

    /**
     * Gets the value of the code property.
     *
     * @return possible object is
     * {@link java.lang.String}
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     *
     * @param value allowed object is
     *              {@link java.lang.String}
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the count property.
     *
     * @return a int.
     */
    public int getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     *
     * @param value a int.
     */
    public void setCount(int value) {
        this.count = value;
    }

    /**
     * Gets the value of the bytes property.
     *
     * @return possible object is
     * {@link java.lang.Integer}
     */
    public Integer getBytes() {
        return bytes;
    }

    /**
     * Sets the value of the bytes property.
     *
     * @param value allowed object is
     *              {@link java.lang.Integer}
     */
    public void setBytes(Integer value) {
        this.bytes = value;
    }

}