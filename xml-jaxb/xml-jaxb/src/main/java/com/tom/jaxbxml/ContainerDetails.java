//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.20 at 08:33:03 PM EST 
//


package com.tom.jaxbxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContainerDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContainerDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContainerDetail" type="{http://www.example.org/Shipment1}ContainerDetail"/>
 *         &lt;element name="ShipmentLine" type="{http://www.example.org/Shipment1}ShipmentLine"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContainerDetails", propOrder = {
    "containerDetail",
    "shipmentLine"
})
public class ContainerDetails {

    @XmlElement(name = "ContainerDetail", required = true)
    protected ContainerDetail containerDetail;
    @XmlElement(name = "ShipmentLine", required = true)
    protected ShipmentLine shipmentLine;

    /**
     * Gets the value of the containerDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ContainerDetail }
     *     
     */
    public ContainerDetail getContainerDetail() {
        return containerDetail;
    }

    /**
     * Sets the value of the containerDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContainerDetail }
     *     
     */
    public void setContainerDetail(ContainerDetail value) {
        this.containerDetail = value;
    }

    /**
     * Gets the value of the shipmentLine property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentLine }
     *     
     */
    public ShipmentLine getShipmentLine() {
        return shipmentLine;
    }

    /**
     * Sets the value of the shipmentLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentLine }
     *     
     */
    public void setShipmentLine(ShipmentLine value) {
        this.shipmentLine = value;
    }

}
