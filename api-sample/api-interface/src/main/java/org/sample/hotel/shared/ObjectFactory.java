//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.18 at 09:23:48 AM CST 
//


package org.sample.hotel.shared;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.sample.hotel.shared package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.sample.hotel.shared
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PromotionType }
     * 
     */
    public PromotionType createPromotionType() {
        return new PromotionType();
    }

    /**
     * Create an instance of {@link TravelerCountType.ChildAgeList }
     * 
     */
    public TravelerCountType.ChildAgeList createTravelerCountTypeChildAgeList() {
        return new TravelerCountType.ChildAgeList();
    }

    /**
     * Create an instance of {@link HotelFault }
     * 
     */
    public HotelFault createHotelFault() {
        return new HotelFault();
    }

    /**
     * Create an instance of {@link TravelerCountType }
     * 
     */
    public TravelerCountType createTravelerCountType() {
        return new TravelerCountType();
    }

    /**
     * Create an instance of {@link PriceType }
     * 
     */
    public PriceType createPriceType() {
        return new PriceType();
    }

    /**
     * Create an instance of {@link AmenityListType }
     * 
     */
    public AmenityListType createAmenityListType() {
        return new AmenityListType();
    }

    /**
     * Create an instance of {@link StayDatesType }
     * 
     */
    public StayDatesType createStayDatesType() {
        return new StayDatesType();
    }

    /**
     * Create an instance of {@link AmountType }
     * 
     */
    public AmountType createAmountType() {
        return new AmountType();
    }

}
