//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.14 at 04:47:30 PM IDT 
//


package org.tipalti;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipaltiPayeePendinginvoiceTotalResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipaltiPayeePendinginvoiceTotalResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Tipalti.org/}TipaltiResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ApprovedUnpaidTotal" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="UnapprovedTotal" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="UnreleasedTotal" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipaltiPayeePendinginvoiceTotalResponse", propOrder = {
    "approvedUnpaidTotal",
    "unapprovedTotal",
    "unreleasedTotal"
})
public class TipaltiPayeePendinginvoiceTotalResponse
    extends TipaltiResponse
{

    @XmlElement(name = "ApprovedUnpaidTotal")
    protected double approvedUnpaidTotal;
    @XmlElement(name = "UnapprovedTotal")
    protected double unapprovedTotal;
    @XmlElement(name = "UnreleasedTotal")
    protected double unreleasedTotal;

    /**
     * Gets the value of the approvedUnpaidTotal property.
     * 
     */
    public double getApprovedUnpaidTotal() {
        return approvedUnpaidTotal;
    }

    /**
     * Sets the value of the approvedUnpaidTotal property.
     * 
     */
    public void setApprovedUnpaidTotal(double value) {
        this.approvedUnpaidTotal = value;
    }

    /**
     * Gets the value of the unapprovedTotal property.
     * 
     */
    public double getUnapprovedTotal() {
        return unapprovedTotal;
    }

    /**
     * Sets the value of the unapprovedTotal property.
     * 
     */
    public void setUnapprovedTotal(double value) {
        this.unapprovedTotal = value;
    }

    /**
     * Gets the value of the unreleasedTotal property.
     * 
     */
    public double getUnreleasedTotal() {
        return unreleasedTotal;
    }

    /**
     * Sets the value of the unreleasedTotal property.
     * 
     */
    public void setUnreleasedTotal(double value) {
        this.unreleasedTotal = value;
    }

}