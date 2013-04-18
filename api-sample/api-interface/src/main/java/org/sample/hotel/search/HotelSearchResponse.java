//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.18 at 09:23:48 AM CST 
//


package org.sample.hotel.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.sample.hotel.shared.StayDatesType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MatchingHotelCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="HotelCount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="StayDates" type="{urn:org:sample:hotel:shared}StayDatesType" minOccurs="0"/>
 *         &lt;element name="HotelInfoList" type="{urn:org:sample:hotel:search}HotelInfoListType"/>
 *         &lt;element name="ErrorList" type="{urn:org:sample:hotel:search}ErrorListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "matchingHotelCount",
    "hotelCount",
    "stayDates",
    "hotelInfoList",
    "errorList"
})
@XmlRootElement(name = "HotelSearchResponse")
public class HotelSearchResponse {

    @XmlElement(name = "MatchingHotelCount")
    protected Long matchingHotelCount;
    @XmlElement(name = "HotelCount")
    protected long hotelCount;
    @XmlElement(name = "StayDates")
    protected StayDatesType stayDates;
    @XmlElement(name = "HotelInfoList", required = true)
    protected HotelInfoListType hotelInfoList;
    @XmlElement(name = "ErrorList")
    protected ErrorListType errorList;

    /**
     * Gets the value of the matchingHotelCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMatchingHotelCount() {
        return matchingHotelCount;
    }

    /**
     * Sets the value of the matchingHotelCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMatchingHotelCount(Long value) {
        this.matchingHotelCount = value;
    }

    /**
     * Gets the value of the hotelCount property.
     * 
     */
    public long getHotelCount() {
        return hotelCount;
    }

    /**
     * Sets the value of the hotelCount property.
     * 
     */
    public void setHotelCount(long value) {
        this.hotelCount = value;
    }

    /**
     * Gets the value of the stayDates property.
     * 
     * @return
     *     possible object is
     *     {@link StayDatesType }
     *     
     */
    public StayDatesType getStayDates() {
        return stayDates;
    }

    /**
     * Sets the value of the stayDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link StayDatesType }
     *     
     */
    public void setStayDates(StayDatesType value) {
        this.stayDates = value;
    }

    /**
     * Gets the value of the hotelInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link HotelInfoListType }
     *     
     */
    public HotelInfoListType getHotelInfoList() {
        return hotelInfoList;
    }

    /**
     * Sets the value of the hotelInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelInfoListType }
     *     
     */
    public void setHotelInfoList(HotelInfoListType value) {
        this.hotelInfoList = value;
    }

    /**
     * Gets the value of the errorList property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorListType }
     *     
     */
    public ErrorListType getErrorList() {
        return errorList;
    }

    /**
     * Sets the value of the errorList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorListType }
     *     
     */
    public void setErrorList(ErrorListType value) {
        this.errorList = value;
    }

}