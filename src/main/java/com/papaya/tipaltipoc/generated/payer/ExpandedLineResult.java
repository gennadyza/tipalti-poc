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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExpandedLineResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExpandedLineResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="status" type="{http://Tipalti.org/}TipaltiLineResultStatus"/&gt;
 *         &lt;element name="paymentOrderStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="refCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lineErrorOrWarningType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpandedLineResult", propOrder = {
    "status",
    "paymentOrderStatus",
    "message",
    "refCode",
    "lineErrorOrWarningType"
})
public class ExpandedLineResult {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TipaltiLineResultStatus status;
    protected String paymentOrderStatus;
    protected String message;
    protected String refCode;
    protected int lineErrorOrWarningType;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link TipaltiLineResultStatus }
     *     
     */
    public TipaltiLineResultStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipaltiLineResultStatus }
     *     
     */
    public void setStatus(TipaltiLineResultStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the paymentOrderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentOrderStatus() {
        return paymentOrderStatus;
    }

    /**
     * Sets the value of the paymentOrderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentOrderStatus(String value) {
        this.paymentOrderStatus = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the refCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefCode() {
        return refCode;
    }

    /**
     * Sets the value of the refCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefCode(String value) {
        this.refCode = value;
    }

    /**
     * Gets the value of the lineErrorOrWarningType property.
     * 
     */
    public int getLineErrorOrWarningType() {
        return lineErrorOrWarningType;
    }

    /**
     * Sets the value of the lineErrorOrWarningType property.
     * 
     */
    public void setLineErrorOrWarningType(int value) {
        this.lineErrorOrWarningType = value;
    }

}
