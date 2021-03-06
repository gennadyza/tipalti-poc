//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.14 at 05:36:33 PM IDT 
//


package com.papaya.tipaltipoc.generated.payer;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceLine"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceInternalNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EWalletMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BankingMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomFields" type="{http://Tipalti.org/}ArrayOfKeyValuePair" minOccurs="0"/&gt;
 *         &lt;element name="GLAccount" type="{http://Tipalti.org/}TipaltiGLAccount" minOccurs="0"/&gt;
 *         &lt;element name="LineType" type="{http://Tipalti.org/}eInvoiceLineType"/&gt;
 *         &lt;element name="LineExternalMetadata" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="BillLineID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TaxCodeExternalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TaxAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="RelatedPurchaseOrders" type="{http://Tipalti.org/}ArrayOfTipaltiRelatedPurchaseOrder" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceLine", propOrder = {
    "currency",
    "amount",
    "description",
    "invoiceInternalNotes",
    "eWalletMessage",
    "bankingMessage",
    "customFields",
    "glAccount",
    "lineType",
    "lineExternalMetadata",
    "quantity",
    "billLineID",
    "taxCodeExternalId",
    "taxAmount",
    "relatedPurchaseOrders"
})
public class InvoiceLine {

    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "Amount")
    protected double amount;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "InvoiceInternalNotes")
    protected String invoiceInternalNotes;
    @XmlElement(name = "EWalletMessage")
    protected String eWalletMessage;
    @XmlElement(name = "BankingMessage")
    protected String bankingMessage;
    @XmlElement(name = "CustomFields")
    protected ArrayOfKeyValuePair customFields;
    @XmlElement(name = "GLAccount")
    protected TipaltiGLAccount glAccount;
    @XmlElement(name = "LineType", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected EInvoiceLineType lineType;
    @XmlElement(name = "LineExternalMetadata")
    protected String lineExternalMetadata;
    @XmlElement(name = "Quantity", required = true, nillable = true)
    protected BigDecimal quantity;
    @XmlElement(name = "BillLineID")
    protected String billLineID;
    @XmlElement(name = "TaxCodeExternalId")
    protected String taxCodeExternalId;
    @XmlElement(name = "TaxAmount", required = true, nillable = true)
    protected BigDecimal taxAmount;
    @XmlElement(name = "RelatedPurchaseOrders")
    protected ArrayOfTipaltiRelatedPurchaseOrder relatedPurchaseOrders;

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(double value) {
        this.amount = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the invoiceInternalNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceInternalNotes() {
        return invoiceInternalNotes;
    }

    /**
     * Sets the value of the invoiceInternalNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceInternalNotes(String value) {
        this.invoiceInternalNotes = value;
    }

    /**
     * Gets the value of the eWalletMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEWalletMessage() {
        return eWalletMessage;
    }

    /**
     * Sets the value of the eWalletMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEWalletMessage(String value) {
        this.eWalletMessage = value;
    }

    /**
     * Gets the value of the bankingMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankingMessage() {
        return bankingMessage;
    }

    /**
     * Sets the value of the bankingMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankingMessage(String value) {
        this.bankingMessage = value;
    }

    /**
     * Gets the value of the customFields property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeyValuePair }
     *     
     */
    public ArrayOfKeyValuePair getCustomFields() {
        return customFields;
    }

    /**
     * Sets the value of the customFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeyValuePair }
     *     
     */
    public void setCustomFields(ArrayOfKeyValuePair value) {
        this.customFields = value;
    }

    /**
     * Gets the value of the glAccount property.
     * 
     * @return
     *     possible object is
     *     {@link TipaltiGLAccount }
     *     
     */
    public TipaltiGLAccount getGLAccount() {
        return glAccount;
    }

    /**
     * Sets the value of the glAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipaltiGLAccount }
     *     
     */
    public void setGLAccount(TipaltiGLAccount value) {
        this.glAccount = value;
    }

    /**
     * Gets the value of the lineType property.
     * 
     * @return
     *     possible object is
     *     {@link EInvoiceLineType }
     *     
     */
    public EInvoiceLineType getLineType() {
        return lineType;
    }

    /**
     * Sets the value of the lineType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EInvoiceLineType }
     *     
     */
    public void setLineType(EInvoiceLineType value) {
        this.lineType = value;
    }

    /**
     * Gets the value of the lineExternalMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineExternalMetadata() {
        return lineExternalMetadata;
    }

    /**
     * Sets the value of the lineExternalMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineExternalMetadata(String value) {
        this.lineExternalMetadata = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantity(BigDecimal value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the billLineID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillLineID() {
        return billLineID;
    }

    /**
     * Sets the value of the billLineID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillLineID(String value) {
        this.billLineID = value;
    }

    /**
     * Gets the value of the taxCodeExternalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxCodeExternalId() {
        return taxCodeExternalId;
    }

    /**
     * Sets the value of the taxCodeExternalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxCodeExternalId(String value) {
        this.taxCodeExternalId = value;
    }

    /**
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxAmount(BigDecimal value) {
        this.taxAmount = value;
    }

    /**
     * Gets the value of the relatedPurchaseOrders property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTipaltiRelatedPurchaseOrder }
     *     
     */
    public ArrayOfTipaltiRelatedPurchaseOrder getRelatedPurchaseOrders() {
        return relatedPurchaseOrders;
    }

    /**
     * Sets the value of the relatedPurchaseOrders property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTipaltiRelatedPurchaseOrder }
     *     
     */
    public void setRelatedPurchaseOrders(ArrayOfTipaltiRelatedPurchaseOrder value) {
        this.relatedPurchaseOrders = value;
    }

}
