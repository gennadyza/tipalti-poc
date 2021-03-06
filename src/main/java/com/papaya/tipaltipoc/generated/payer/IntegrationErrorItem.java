//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.14 at 05:36:33 PM IDT 
//


package com.papaya.tipaltipoc.generated.payer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntegrationErrorItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntegrationErrorItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CreationTimestamp" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="SyncDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ErrorSubject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ErrorDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IntegrationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IntegrationVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntegrationErrorItem", propOrder = {
    "creationTimestamp",
    "syncDirection",
    "errorSubject",
    "errorDetails",
    "integrationName",
    "integrationVersion"
})
public class IntegrationErrorItem {

    @XmlElement(name = "CreationTimestamp")
    protected long creationTimestamp;
    @XmlElement(name = "SyncDirection")
    protected String syncDirection;
    @XmlElement(name = "ErrorSubject")
    protected String errorSubject;
    @XmlElement(name = "ErrorDetails")
    protected String errorDetails;
    @XmlElement(name = "IntegrationName")
    protected String integrationName;
    @XmlElement(name = "IntegrationVersion")
    protected String integrationVersion;

    /**
     * Gets the value of the creationTimestamp property.
     * 
     */
    public long getCreationTimestamp() {
        return creationTimestamp;
    }

    /**
     * Sets the value of the creationTimestamp property.
     * 
     */
    public void setCreationTimestamp(long value) {
        this.creationTimestamp = value;
    }

    /**
     * Gets the value of the syncDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSyncDirection() {
        return syncDirection;
    }

    /**
     * Sets the value of the syncDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSyncDirection(String value) {
        this.syncDirection = value;
    }

    /**
     * Gets the value of the errorSubject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorSubject() {
        return errorSubject;
    }

    /**
     * Sets the value of the errorSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorSubject(String value) {
        this.errorSubject = value;
    }

    /**
     * Gets the value of the errorDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorDetails() {
        return errorDetails;
    }

    /**
     * Sets the value of the errorDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorDetails(String value) {
        this.errorDetails = value;
    }

    /**
     * Gets the value of the integrationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntegrationName() {
        return integrationName;
    }

    /**
     * Sets the value of the integrationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntegrationName(String value) {
        this.integrationName = value;
    }

    /**
     * Gets the value of the integrationVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntegrationVersion() {
        return integrationVersion;
    }

    /**
     * Sets the value of the integrationVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntegrationVersion(String value) {
        this.integrationVersion = value;
    }

}
