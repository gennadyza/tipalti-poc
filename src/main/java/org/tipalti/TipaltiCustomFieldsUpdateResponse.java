//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.14 at 03:21:54 PM IDT 
//


package org.tipalti;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipaltiCustomFieldsUpdateResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipaltiCustomFieldsUpdateResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Tipalti.org/}TipaltiResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomFieldUpdateResult" type="{http://Tipalti.org/}ArrayOfTipaltiCustomFieldUpdateResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipaltiCustomFieldsUpdateResponse", propOrder = {
    "customFieldUpdateResult"
})
public class TipaltiCustomFieldsUpdateResponse
    extends TipaltiResponse
{

    @XmlElement(name = "CustomFieldUpdateResult")
    protected ArrayOfTipaltiCustomFieldUpdateResponse customFieldUpdateResult;

    /**
     * Gets the value of the customFieldUpdateResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTipaltiCustomFieldUpdateResponse }
     *     
     */
    public ArrayOfTipaltiCustomFieldUpdateResponse getCustomFieldUpdateResult() {
        return customFieldUpdateResult;
    }

    /**
     * Sets the value of the customFieldUpdateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTipaltiCustomFieldUpdateResponse }
     *     
     */
    public void setCustomFieldUpdateResult(ArrayOfTipaltiCustomFieldUpdateResponse value) {
        this.customFieldUpdateResult = value;
    }

}
