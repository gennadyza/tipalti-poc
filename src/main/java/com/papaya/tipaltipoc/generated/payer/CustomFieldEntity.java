//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.14 at 05:36:33 PM IDT 
//


package com.papaya.tipaltipoc.generated.payer;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomFieldEntity.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomFieldEntity"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PaymentOrder"/&gt;
 *     &lt;enumeration value="Payee"/&gt;
 *     &lt;enumeration value="Invoice"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CustomFieldEntity")
@XmlEnum
public enum CustomFieldEntity {

    @XmlEnumValue("PaymentOrder")
    PAYMENT_ORDER("PaymentOrder"),
    @XmlEnumValue("Payee")
    PAYEE("Payee"),
    @XmlEnumValue("Invoice")
    INVOICE("Invoice");
    private final String value;

    CustomFieldEntity(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomFieldEntity fromValue(String v) {
        for (CustomFieldEntity c: CustomFieldEntity.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
