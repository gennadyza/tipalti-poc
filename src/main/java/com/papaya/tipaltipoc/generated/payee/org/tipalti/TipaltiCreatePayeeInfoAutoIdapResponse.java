//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.14 at 04:47:30 PM IDT 
//


package org.tipalti;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipaltiCreatePayeeInfoAutoIdapResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipaltiCreatePayeeInfoAutoIdapResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Tipalti.org/}TipaltiResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="createdIdap" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipaltiCreatePayeeInfoAutoIdapResponse", propOrder = {
    "createdIdap"
})
public class TipaltiCreatePayeeInfoAutoIdapResponse
    extends TipaltiResponse
{

    protected String createdIdap;

    /**
     * Gets the value of the createdIdap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedIdap() {
        return createdIdap;
    }

    /**
     * Sets the value of the createdIdap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedIdap(String value) {
        this.createdIdap = value;
    }

}
