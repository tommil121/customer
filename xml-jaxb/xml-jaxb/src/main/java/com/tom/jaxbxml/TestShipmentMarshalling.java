package com.tom.jaxbxml;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class TestShipmentMarshalling {
	
	static Shipment shipment = new Shipment();
	static Containers containers = new Containers();
	static Container container = new Container();
	static ContainerDetails containerDetails = new ContainerDetails();
	static ContainerDetail containerDetail = new ContainerDetail();
	static Extn extn = new Extn();
	static ShipmentLine shipmentLine = new ShipmentLine();
	static ShipmentLines shipmentLines = new ShipmentLines();
	
	static {
		shipment.setShipNode("GSI-DC355");
		shipment.setSCAC("UPS");
		shipment.setCarrierServiceCode("GROUND");
		shipment.setEnterpriseCode("DPH_CA");
		shipment.setOrderNo("100847868310");
		shipment.setReleaseNo("1");
		shipment.setDocumentType("0001");
		shipment.setIsSingleOrder("Y");
		shipment.setActualShipmentDate("2020-02-10");
		shipment.setFileName("OrderShipment_202081010450506.xml");
		shipment.setMessageId("29240273");
		shipment.setGsiClientId("ELCNA");
		shipment.setGsiStoreId("DPHCA");
		shipment.setGsiCatalogId("187");
		
		
		
	}
	public static void main(String[] args) throws JAXBException {
		//marshalingExample();
		System.out.println("************************************************");
		unMarshalingExample();
	}
	
	private static void unMarshalingExample() throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(Shipment.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		Shipment shipment = (Shipment) jaxbUnmarshaller.unmarshal( new File("shipment_example.xml") );
		
			/*System.out.println(shipment.getShipNode());
			System.out.println(shipment.getSCAC());
			System.out.println(shipment.getCarrierServiceCode());
			System.out.println(shipment.getEnterpriseCode());
			System.out.println(shipment.getOrderNo());
			System.out.println(shipment.getReleaseNo());
			System.out.println(shipment.getDocumentType());
			System.out.println(shipment.getIsSingleOrder());
			System.out.println(shipment.getActualShipmentDate());
			System.out.println(shipment.getFileName());
			System.out.println(shipment.getMessageId());
			System.out.println(shipment.getGsiClientId());
			System.out.println(shipment.getGsiStoreId());
			System.out.println(shipment.getGsiCatalogId());
			System.out.println(extn.getExtnQuantity());*/
	}

	private static void marshalingExample() throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(Shipment.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
 
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
 
		jaxbMarshaller.marshal(shipment, System.out);
		jaxbMarshaller.marshal(shipment, new File("shipment.xml"));
	}

}
