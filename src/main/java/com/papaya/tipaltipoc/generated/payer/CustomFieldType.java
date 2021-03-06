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
 * <p>Java class for CustomFieldType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomFieldType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FreeText"/&gt;
 *     &lt;enumeration value="UniqueText"/&gt;
 *     &lt;enumeration value="MultipleValues"/&gt;
 *     &lt;enumeration value="ListOfValues"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CustomFieldType")
@XmlEnum
public enum CustomFieldType {

    @XmlEnumValue("FreeText")
    FREE_TEXT("FreeText"),
    @XmlEnumValue("UniqueText")
    UNIQUE_TEXT("UniqueText"),
    @XmlEnumValue("MultipleValues")
    MULTIPLE_VALUES("MultipleValues"),
    @XmlEnumValue("ListOfValues")
    LIST_OF_VALUES("ListOfValues");
    private final String value;

    CustomFieldType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomFieldType fromValue(String v) {
        for (CustomFieldType c: CustomFieldType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
