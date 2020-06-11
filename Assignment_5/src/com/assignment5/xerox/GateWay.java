/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment5.xerox;

import com.assignment5.analytics.AnalysisHelper;
import com.assignment5.analytics.DataStore;
import com.assignment5.entities.Customer;
import com.assignment5.entities.Item;
import com.assignment5.entities.Order;
import com.assignment5.entities.Product;
import com.assignment5.entities.ProductData;
import com.assignment5.entities.SalesPerson;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 *
 * @author PhythonNo1
 */

public class GateWay {
    
    DataReader productReader;
    DataReader orderReader;
    AnalysisHelper helper;
    
    public GateWay() throws IOException {
        DataGenerator generator = DataGenerator.getInstance();
        productReader = new DataReader(generator.getProductCataloguePath());
        orderReader = new DataReader(generator.getOrderFilePath());
        helper = new AnalysisHelper();
    }
    
    public static void main(String args[]) throws IOException {
        GateWay gateWay = new GateWay();
        gateWay.readData();
    }
    
    private void readData() throws IOException{
        String[] row;
        while((row = productReader.getNextRow()) != null ){
            generateProduct(row);
        }
        while((row = orderReader.getNextRow()) != null ){
            Order order = generateOrder(row);
            generateCustomer(order, row);
            generateSalesPerson(order, row);
        }
        runAnalysis();
    }
    
    private void generateProduct(String[] row) {
        int productId = Integer.parseInt(row[0]);
        int minPrice = Integer.parseInt(row[1]);
        int maxPrice = Integer.parseInt(row[2]);
        int targetPrice = Integer.parseInt(row[3]);
        
        Product product = new Product(productId, minPrice, maxPrice, targetPrice);
        DataStore.getInstance().getProductMap().put(productId, product);
        
    }
    
    private Order generateOrder(String[] row) {
        int orderId = Integer.parseInt(row[0]);
        int itemId = Integer.parseInt(row[1]);
        int productId = Integer.parseInt(row[2]);
        int quantity = Integer.parseInt(row[3]);
        int salesId = Integer.parseInt(row[4]);
        int customerId = Integer.parseInt(row[5]);
        int salesPrice = Integer.parseInt(row[6]);
        String marketSeg = row[7];
        
        Order order = new Order(orderId, salesId, customerId, itemId);
        Item item = new Item(itemId, productId, salesPrice, quantity);
        
        DataStore.getInstance().getOrderMap().put(orderId, order);
        DataStore.getInstance().getItemMap().put(itemId, item);
        
        return order;
    }
    
    private void generateCustomer(Order order, String[] row) {
        int customerId = Integer.parseInt(row[5]);
        
        Map<Integer, Customer> customerMap = DataStore.getInstance().getCustomerMap();
        
        if(customerMap.containsKey(customerId)) {
            customerMap.get(customerId).getOrderList().add(order.getOrderId());
        } else {
            Customer customer = new Customer(customerId);
            customer.getOrderList().add(order.getOrderId());
            customerMap.put(customerId, customer);
        }
    }
    
    private void generateSalesPerson(Order order, String[] row) {
        int salesId = Integer.parseInt(row[4]);
        
        Map<Integer, SalesPerson> salesPersonMap = DataStore.getInstance().getSalesPersonMap();
        
        if(salesPersonMap.containsKey(salesId)) {
            salesPersonMap.get(salesId).getOrderList().add(order.getOrderId());
        } else {
            SalesPerson salesPerson = new SalesPerson(salesId);
            salesPerson.getOrderList().add(order.getOrderId());
            salesPersonMap.put(salesId, salesPerson);
        }
    }
    

    
    private void runAnalysis() {
        
        helper.topThreeBestNegotiatedProducts();
        helper.topThreeBestCustomers();
        
        Map<SalesPerson, Integer> salesProfits = helper.topThreeBestSalesPerson();
        
        helper.totalRevenue(salesProfits);
        List<ProductData> generateOriginData = helper.generateOriginData();
        
        helper.modifedData(generateOriginData);
        
    }
    
}
