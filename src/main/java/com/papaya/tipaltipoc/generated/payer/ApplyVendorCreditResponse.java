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
 *         &lt;element name="ApplyVendorCreditResult" type="{http://Tipalti.org/}TipaltiApplyVendorCreditResponse" minOccurs="0"/&gt;
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
    "applyVendorCreditResult"
})
@XmlRootElement(name = "ApplyVendorCreditResponse")
public class ApplyVendorCreditResponse {

    @XmlElement(name = "ApplyVendorCreditResult")
    protected TipaltiApplyVendorCreditResponse applyVendorCreditResult;

    /**
     * Gets the value of the applyVendorCreditResult property.
     * 
     * @return
     *     possible object is
     *     {@link TipaltiApplyVendorCreditResponse }
     *     
     */
    public TipaltiApplyVendorCreditResponse getApplyVendorCreditResult() {
        return applyVendorCreditResult;
    }

    /**
     * Sets the value of the applyVendorCreditResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipaltiApplyVendorCreditResponse }
     *     
     */
    public void setApplyVendorCreditResult(TipaltiApplyVendorCreditResponse value) {
        this.applyVendorCreditResult = value;
    }

}
