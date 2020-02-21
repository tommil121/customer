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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Shipment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Shipment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Containers" type="{http://www.example.org/Shipment1}Containers"/>
 *         &lt;element name="ShipmentLines" type="{http://www.example.org/Shipment1}ShipmentLines"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ShipNode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SCAC" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CarrierServiceCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="EnterpriseCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="OrderNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ReleaseNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DocumentType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IsSingleOrder" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ActualShipmentDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="file_name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MessageId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="gsi_client_id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="gsi_store_id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="gsi_catalog_id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "shipment", propOrder = {
    "containers",
    "shipmentLines"
})
public class Shipment {

    @XmlElement(name = "Containers", required = true)
    protected Containers containers;
    @XmlElement(name = "ShipmentLines", required = true)
    protected ShipmentLines shipmentLines;
    @XmlAttribute(name = "ShipNode")
    protected String shipNode;
    @XmlAttribute(name = "SCAC")
    protected String scac;
    @XmlAttribute(name = "CarrierServiceCode")
    protected String carrierServiceCode;
    @XmlAttribute(name = "EnterpriseCode")
    protected String enterpriseCode;
    @XmlAttribute(name = "OrderNo")
    protected String orderNo;
    @XmlAttribute(name = "ReleaseNo")
    protected String releaseNo;
    @XmlAttribute(name = "DocumentType")
    protected String documentType;
    @XmlAttribute(name = "IsSingleOrder")
    protected String isSingleOrder;
    @XmlAttribute(name = "ActualShipmentDate")
    protected String actualShipmentDate;
    @XmlAttribute(name = "file_name")
    protected String fileName;
    @XmlAttribute(name = "MessageId")
    protected String messageId;
    @XmlAttribute(name = "gsi_client_id")
    protected String gsiClientId;
    @XmlAttribute(name = "gsi_store_id")
    protected String gsiStoreId;
    @XmlAttribute(name = "gsi_catalog_id")
    protected String gsiCatalogId;

    /**
     * Gets the value of the containers property.
     * 
     * @return
     *     possible object is
     *     {@link Containers }
     *     
     */
    public Containers getContainers() {
        return containers;
    }

    /**
     * Sets the value of the containers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Containers }
     *     
     */
    public void setContainers(Containers value) {
        this.containers = value;
    }

    /**
     * Gets the value of the shipmentLines property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentLines }
     *     
     */
    public ShipmentLines getShipmentLines() {
        return shipmentLines;
    }

    /**
     * Sets the value of the shipmentLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentLines }
     *     
     */
    public void setShipmentLines(ShipmentLines value) {
        this.shipmentLines = value;
    }

    /**
     * Gets the value of the shipNode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipNode() {
        return shipNode;
    }

    /**
     * Sets the value of the shipNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipNode(String value) {
        this.shipNode = value;
    }

    /**
     * Gets the value of the scac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCAC() {
        return scac;
    }

    /**
     * Sets the value of the scac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCAC(String value) {
        this.scac = value;
    }

    /**
     * Gets the value of the carrierServiceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierServiceCode() {
        return carrierServiceCode;
    }

    /**
     * Sets the value of the carrierServiceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierServiceCode(String value) {
        this.carrierServiceCode = value;
    }

    /**
     * Gets the value of the enterpriseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnterpriseCode() {
        return enterpriseCode;
    }

    /**
     * Sets the value of the enterpriseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnterpriseCode(String value) {
        this.enterpriseCode = value;
    }

    /**
     * Gets the value of the orderNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * Sets the value of the orderNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderNo(String value) {
        this.orderNo = value;
    }

    /**
     * Gets the value of the releaseNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReleaseNo() {
        return releaseNo;
    }

    /**
     * Sets the value of the releaseNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReleaseNo(String value) {
        this.releaseNo = value;
    }

    /**
     * Gets the value of the documentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentType(String value) {
        this.documentType = value;
    }

    /**
     * Gets the value of the isSingleOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsSingleOrder() {
        return isSingleOrder;
    }

    /**
     * Sets the value of the isSingleOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsSingleOrder(String value) {
        this.isSingleOrder = value;
    }

    /**
     * Gets the value of the actualShipmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualShipmentDate() {
        return actualShipmentDate;
    }

    /**
     * Sets the value of the actualShipmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualShipmentDate(String value) {
        this.actualShipmentDate = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the messageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * Sets the value of the messageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageId(String value) {
        this.messageId = value;
    }

    /**
     * Gets the value of the gsiClientId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGsiClientId() {
        return gsiClientId;
    }

    /**
     * Sets the value of the gsiClientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGsiClientId(String value) {
        this.gsiClientId = value;
    }

    /**
     * Gets the value of the gsiStoreId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGsiStoreId() {
        return gsiStoreId;
    }

    /**
     * Sets the value of the gsiStoreId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGsiStoreId(String value) {
        this.gsiStoreId = value;
    }

    /**
     * Gets the value of the gsiCatalogId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGsiCatalogId() {
        return gsiCatalogId;
    }

    /**
     * Sets the value of the gsiCatalogId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGsiCatalogId(String value) {
        this.gsiCatalogId = value;
    }

}
