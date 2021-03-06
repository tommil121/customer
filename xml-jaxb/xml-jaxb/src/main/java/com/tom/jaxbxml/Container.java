//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.20 at 08:33:03 PM EST 
//


package com.tom.jaxbxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Container complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Container">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContainerDetails" type="{http://www.example.org/Shipment1}ContainerDetails"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TrackingNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Container", propOrder = {
    "containerDetails"
})
public class Container {

    @XmlElement(name = "ContainerDetails", required = true)
    protected ContainerDetails containerDetails;
    @XmlAttribute(name = "TrackingNo")
    protected String trackingNo;

    /**
     * Gets the value of the containerDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ContainerDetails }
     *     
     */
    public ContainerDetails getContainerDetails() {
        return containerDetails;
    }

    /**
     * Sets the value of the containerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContainerDetails }
     *     
     */
    public void setContainerDetails(ContainerDetails value) {
        this.containerDetails = value;
    }

    /**
     * Gets the value of the trackingNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingNo() {
        return trackingNo;
    }

    /**
     * Sets the value of the trackingNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingNo(String value) {
        this.trackingNo = value;
    }

}
