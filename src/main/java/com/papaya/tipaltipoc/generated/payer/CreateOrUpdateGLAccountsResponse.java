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
 *         &lt;element name="CreateOrUpdateGLAccountsResult" type="{http://Tipalti.org/}TipaltiResponse" minOccurs="0"/&gt;
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
    "createOrUpdateGLAccountsResult"
})
@XmlRootElement(name = "CreateOrUpdateGLAccountsResponse")
public class CreateOrUpdateGLAccountsResponse {

    @XmlElement(name = "CreateOrUpdateGLAccountsResult")
    protected TipaltiResponse createOrUpdateGLAccountsResult;

    /**
     * Gets the value of the createOrUpdateGLAccountsResult property.
     * 
     * @return
     *     possible object is
     *     {@link TipaltiResponse }
     *     
     */
    public TipaltiResponse getCreateOrUpdateGLAccountsResult() {
        return createOrUpdateGLAccountsResult;
    }

    /**
     * Sets the value of the createOrUpdateGLAccountsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipaltiResponse }
     *     
     */
    public void setCreateOrUpdateGLAccountsResult(TipaltiResponse value) {
        this.createOrUpdateGLAccountsResult = value;
    }

}
