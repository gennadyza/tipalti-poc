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
 *         &lt;element name="GetPayeeInvoicesListDetailsResult" type="{http://Tipalti.org/}TipaltiGetPayeeInvoicesListDetailsResponse" minOccurs="0"/&gt;
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
    "getPayeeInvoicesListDetailsResult"
})
@XmlRootElement(name = "GetPayeeInvoicesListDetailsResponse")
public class GetPayeeInvoicesListDetailsResponse {

    @XmlElement(name = "GetPayeeInvoicesListDetailsResult")
    protected TipaltiGetPayeeInvoicesListDetailsResponse getPayeeInvoicesListDetailsResult;

    /**
     * Gets the value of the getPayeeInvoicesListDetailsResult property.
     * 
     * @return
     *     possible object is
     *     {@link TipaltiGetPayeeInvoicesListDetailsResponse }
     *     
     */
    public TipaltiGetPayeeInvoicesListDetailsResponse getGetPayeeInvoicesListDetailsResult() {
        return getPayeeInvoicesListDetailsResult;
    }

    /**
     * Sets the value of the getPayeeInvoicesListDetailsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipaltiGetPayeeInvoicesListDetailsResponse }
     *     
     */
    public void setGetPayeeInvoicesListDetailsResult(TipaltiGetPayeeInvoicesListDetailsResponse value) {
        this.getPayeeInvoicesListDetailsResult = value;
    }

}
