/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment5.analytics;

import com.assignment5.entities.Customer;
import com.assignment5.entities.Item;
import com.assignment5.entities.Order;
import com.assignment5.entities.Product;
import com.assignment5.entities.SalesPerson;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author PhythonNo1
 */

public class DataStore {
    
    private Map<Integer, Customer> customerMap;
    private Map<Integer, Item> itemMap;
    private Map<Integer, Order> orderMap;
    private Map<Integer, Product> productMap;
    private Map<Integer, SalesPerson> salesPersonMap;
    
    private static DataStore dataStore;
    
    private DataStore() {
        this.customerMap = new HashMap<>();
        this.itemMap = new HashMap<>();
        this.orderMap = new HashMap<>();
        this.productMap = new HashMap<>();
        this.salesPersonMap = new HashMap<>();
    }
    
    public static DataStore getInstance() {
        if(dataStore == null) {
            dataStore = new DataStore();
        }
        return dataStore;
    }

    public Map<Integer, Customer> getCustomerMap() {
        return customerMap;
    }

    public Map<Integer, Item> getItemMap() {
        return itemMap;
    }

    public Map<Integer, Order> getOrderMap() {
        return orderMap;
    }

    public Map<Integer, Product> getProductMap() {
        return productMap;
    }

    public Map<Integer, SalesPerson> getSalesPersonMap() {
        return salesPersonMap;
    }

    
}


