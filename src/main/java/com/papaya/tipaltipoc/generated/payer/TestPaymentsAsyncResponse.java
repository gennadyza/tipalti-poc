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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TestPaymentsAsyncResult" type="{http://Tipalti.org/}TipaltiProcessPaymentAsyncResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "testPaymentsAsyncResult"
})
@XmlRootElement(name = "TestPaymentsAsyncResponse")
public class TestPaymentsAsyncResponse {

    @XmlElement(name = "TestPaymentsAsyncResult")
    protected TipaltiProcessPaymentAsyncResult testPaymentsAsyncResult;

    /**
     * Gets the value of the testPaymentsAsyncResult property.
     * 
     * @return
     *     possible object is
     *     {@link TipaltiProcessPaymentAsyncResult }
     *     
     */
    public TipaltiProcessPaymentAsyncResult getTestPaymentsAsyncResult() {
        return testPaymentsAsyncResult;
    }

    /**
     * Sets the value of the testPaymentsAsyncResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipaltiProcessPaymentAsyncResult }
     *     
     */
    public void setTestPaymentsAsyncResult(TipaltiProcessPaymentAsyncResult value) {
        this.testPaymentsAsyncResult = value;
    }

}