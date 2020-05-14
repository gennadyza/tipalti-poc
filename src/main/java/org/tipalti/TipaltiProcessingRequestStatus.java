//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.14 at 03:21:54 PM IDT 
//


package org.tipalti;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipaltiProcessingRequestStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipaltiProcessingRequestStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Processing"/&gt;
 *     &lt;enumeration value="Failed"/&gt;
 *     &lt;enumeration value="Cancelled"/&gt;
 *     &lt;enumeration value="Completed"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TipaltiProcessingRequestStatus")
@XmlEnum
public enum TipaltiProcessingRequestStatus {

    @XmlEnumValue("Processing")
    PROCESSING("Processing"),
    @XmlEnumValue("Failed")
    FAILED("Failed"),
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),
    @XmlEnumValue("Completed")
    COMPLETED("Completed");
    private final String value;

    TipaltiProcessingRequestStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipaltiProcessingRequestStatus fromValue(String v) {
        for (TipaltiProcessingRequestStatus c: TipaltiProcessingRequestStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
