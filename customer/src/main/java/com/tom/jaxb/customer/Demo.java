package com.tom.jaxb.customer;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
 
public class Demo {
 
    public static void main(String[] args) throws Exception {
        JAXBContext jc = JAXBContext.newInstance(Customer.class);
         
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        File xml = new File("Customer.xml");
        Customer customer = (Customer) unmarshaller.unmarshal(xml);
         
        Marshaller marshaller = jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(customer, System.out);
        marshaller.marshal(customer, new File("customers.xml"));
    }
     
}