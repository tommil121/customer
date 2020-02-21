package com.tom.jaxb.customer;

import java.util.Date;

public class CustomerFactory {
 
    public static Customer createCustomer() {
        return new Customer(new Date());
    }
 
}