//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.14 at 04:47:28 PM IDT 
//


package org.tipalti;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipaltiProcessPaymentsSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipaltiProcessPaymentsSummary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="accountCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fundsRequired" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="outstandingAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="tipaltiSummaryAmounts" type="{http://Tipalti.org/}ArrayOfTipaltiSummaryAmounts" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipaltiProcessPaymentsSummary", propOrder = {
    "accountType",
    "accountCurrency",
    "fundsRequired",
    "outstandingAmount",
    "tipaltiSummaryAmounts"
})
public class TipaltiProcessPaymentsSummary {

    protected int accountType;
    protected String accountCurrency;
    protected double fundsRequired;
    protected double outstandingAmount;
    protected ArrayOfTipaltiSummaryAmounts tipaltiSummaryAmounts;

    /**
     * Gets the value of the accountType property.
     * 
     */
    public int getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     */
    public void setAccountType(int value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the accountCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountCurrency() {
        return accountCurrency;
    }

    /**
     * Sets the value of the accountCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountCurrency(String value) {
        this.accountCurrency = value;
    }

    /**
     * Gets the value of the fundsRequired property.
     * 
     */
    public double getFundsRequired() {
        return fundsRequired;
    }

    /**
     * Sets the value of the fundsRequired property.
     * 
     */
    public void setFundsRequired(double value) {
        this.fundsRequired = value;
    }

    /**
     * Gets the value of the outstandingAmount property.
     * 
     */
    public double getOutstandingAmount() {
        return outstandingAmount;
    }

    /**
     * Sets the value of the outstandingAmount property.
     * 
     */
    public void setOutstandingAmount(double value) {
        this.outstandingAmount = value;
    }

    /**
     * Gets the value of the tipaltiSummaryAmounts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTipaltiSummaryAmounts }
     *     
     */
    public ArrayOfTipaltiSummaryAmounts getTipaltiSummaryAmounts() {
        return tipaltiSummaryAmounts;
    }

    /**
     * Sets the value of the tipaltiSummaryAmounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTipaltiSummaryAmounts }
     *     
     */
    public void setTipaltiSummaryAmounts(ArrayOfTipaltiSummaryAmounts value) {
        this.tipaltiSummaryAmounts = value;
    }

}