//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.14 at 04:47:30 PM IDT 
//


package org.tipalti;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EPayeeApprovalStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EPayeeApprovalStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Approved"/&gt;
 *     &lt;enumeration value="Declined"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EPayeeApprovalStatus")
@XmlEnum
public enum EPayeeApprovalStatus {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Approved")
    APPROVED("Approved"),
    @XmlEnumValue("Declined")
    DECLINED("Declined");
    private final String value;

    EPayeeApprovalStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EPayeeApprovalStatus fromValue(String v) {
        for (EPayeeApprovalStatus c: EPayeeApprovalStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}