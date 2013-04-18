//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.18 at 09:23:48 AM CST 
//


package org.sample.hotel.search;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeeplinkType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeeplinkType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AllLinks"/>
 *     &lt;enumeration value="HotelDetails"/>
 *     &lt;enumeration value="RateDetails"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeeplinkType")
@XmlEnum
public enum DeeplinkType {

    @XmlEnumValue("AllLinks")
    ALL_LINKS("AllLinks"),
    @XmlEnumValue("HotelDetails")
    HOTEL_DETAILS("HotelDetails"),
    @XmlEnumValue("RateDetails")
    RATE_DETAILS("RateDetails");
    private final String value;

    DeeplinkType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeeplinkType fromValue(String v) {
        for (DeeplinkType c: DeeplinkType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
