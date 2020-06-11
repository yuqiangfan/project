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
import com.assignment5.entities.ProductData;
import com.assignment5.entities.SalesPerson;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

/**
 *
 * @author PhythonNo1
 */

public class AnalysisHelper {
 
    public void topThreeBestNegotiatedProducts() {
        Map<Integer, Item> itemMap = DataStore.getInstance().getItemMap();
        Map<Integer, Product> productMap = DataStore.getInstance().getProductMap();
        Map<Product, Integer> productPrice = new HashMap<>();
        
        //Use map to tarvase DataStore's item
        //product' salesPrice and targetPrice, and make the differnce save in productPriceMap
        for(Map.Entry<Integer, Item> entry : itemMap.entrySet()) {
            Item item = entry.getValue();
            int productId = item.getProductId();
            Product product = productMap.get(productId);
            int targetPrice = product.getTargetPrice();
            int salesPrice = item.getSalesPrice();
            int diffPrice = salesPrice - targetPrice;
            
            if (diffPrice >0){
                productPrice.put(product, productPrice.getOrDefault(product, 0) + 1);
                }
            }
        
        // count only item salesPrice > targetPrice, for sum difference of a product goes to negative
        Map<Integer, Integer> resMap = new HashMap<>();
        for(Map.Entry<Product, Integer> entry : productPrice.entrySet()) {
            if(entry.getValue() > 0) {
                resMap.put(entry.getKey().getProductId(), entry.getValue());//resMap.put(entry.getKey().getProductId(), 0);
            }
            //System.out.println("product id"+entry.getKey().getProductId()+"and value is"+entry.getValue());
        }
        System.out.println("");
        System.out.print("Q1: ");
        System.out.println("Our top 3 best negotiated products are: ");
        System.out.println("numbers of product which has order that sale price above the target price: " + resMap.keySet().size());//resMap
        //
        
        // uss PriorityQueue to sort
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(16, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                if(o1.getValue().equals(o2.getValue())) {
                    return 0;
                }
                return o1.getValue() > o2.getValue() ? -1 : 1;
            }
        });
        
        //5. use key-value pair to sort in priority queue
        for(Map.Entry<Integer, Integer> entry : resMap.entrySet()) {
            maxHeap.offer(entry);
        }
                
        int i = 0;
        Map.Entry<Integer, Integer> entryTop = maxHeap.peek();
        if(entryTop == null) {
            return;
        }
        int value = entryTop.getValue();
        while(!maxHeap.isEmpty() && i < 3) {
            Map.Entry<Integer, Integer> entry = maxHeap.poll();
            if(entry.getValue() == value) {
                
            } else {
                i++;
                value = entry.getValue();
                //System.out.println("");
                if(i == 3) {
                    break;
                }
            }
            int j=i+1;
            System.out.println(i+1 + 
                    ". product: " + entry.getKey() + ", quantity: " + entry.getValue());
        }
        System.out.println("");
        
    }
    public void topThreeBestCustomers() {
        Map<Integer, Customer> customerMap = DataStore.getInstance().getCustomerMap();
        Map<Integer, Order> orderMap = DataStore.getInstance().getOrderMap();
        Map<Integer, Item> itemMap = DataStore.getInstance().getItemMap();
        Map<Integer, Product> productMap = DataStore.getInstance().getProductMap();
        
        Map<Customer, Double> customerDiffMap = new HashMap<>();
        
        for(Map.Entry<Integer, Customer> entry : customerMap.entrySet()) {
            
            Customer customer = entry.getValue();
            List<Integer> orderList = customer.getOrderList();
            
            int totalDiffPrice = 0;
            int totalQuantity = 0;
            
            for(Integer orderId : orderList) {
                
                Order order = orderMap.get(orderId);
                int itemId = order.getItemId();
                Item item = itemMap.get(itemId);
                int productId = item.getProductId();
                Product product = productMap.get(productId);
                
                int salesPrice = item.getSalesPrice();
                int targetPrice = product.getTargetPrice();
                int quantity = item.getQuantity();
                int diffPrice = Math.abs(salesPrice - targetPrice);
                
                totalDiffPrice += diffPrice * quantity;
                totalQuantity += quantity;
            }
            
            double averageAbsDiff = ((double) totalDiffPrice) / ((double) totalQuantity);
            customerDiffMap.put(customer, averageAbsDiff);
        }
        
        PriorityQueue<Map.Entry<Customer, Double>> minHeap = new PriorityQueue<>(16, new Comparator<Map.Entry<Customer, Double>>() {
            @Override
            public int compare(Map.Entry<Customer, Double> o1, Map.Entry<Customer, Double> o2) {
                if(o1.getValue().equals(o2.getValue())) {
                    return 0;
                }
                return o1.getValue() < o2.getValue() ? -1 : 1;
            }
        });
        
        for(Map.Entry<Customer, Double> entry : customerDiffMap.entrySet()) {
            minHeap.offer(entry);
        }
        
        System.out.println("Q2: Our top 3 best customers are: ");
        int i = 0;
        double value = minHeap.peek().getValue();
        while(!minHeap.isEmpty() && i < 3) {
            Map.Entry<Customer, Double> entry = minHeap.poll();
            if(entry.getValue() == value) {
                
            } else {
                i++;
                value = entry.getValue();
                if(i == 3) {
                    break;
                }
            }
            System.out.println(i+1 + 
                    ". customer Id: " + entry.getKey().getCustomerId() + 
                    ", average absolute difference: " + entry.getValue());
        }
        System.out.println("");
    }
    
    
    public Map<SalesPerson, Integer> topThreeBestSalesPerson() {
        Map<Integer, SalesPerson> salesPersonMap = DataStore.getInstance().getSalesPersonMap();
        Map<Integer, Order> orderMap = DataStore.getInstance().getOrderMap();
        Map<Integer, Item> itemMap = DataStore.getInstance().getItemMap();
        Map<Integer, Product> productMap = DataStore.getInstance().getProductMap();
        
        Map<SalesPerson, Integer> salesProfits = new HashMap<>();
        
        for(Map.Entry<Integer, SalesPerson> entry : salesPersonMap.entrySet()) {
            SalesPerson salesPerson = entry.getValue();
            List<Integer> orderList = salesPerson.getOrderList();
            
            int totalProfits = 0;
            
            for(Integer orderId : orderList) {
                
                Order order = orderMap.get(orderId);
                int itemId = order.getItemId();
                Item item = itemMap.get(itemId);
                int productId = item.getProductId();
                Product product = productMap.get(productId);
                
                int targetPrice = product.getTargetPrice();
                int salesPrice = item.getSalesPrice();
                int quantity = item.getQuantity();
                int profits = salesPrice - targetPrice;
                
                totalProfits += quantity * profits;
            }
            salesProfits.put(salesPerson, totalProfits);
        }
        
        PriorityQueue<Map.Entry<SalesPerson, Integer>> maxHeap = new PriorityQueue<>(16, new Comparator<Map.Entry<SalesPerson, Integer>>() {
            @Override
            public int compare(Map.Entry<SalesPerson, Integer> o1, Map.Entry<SalesPerson, Integer> o2) {
                if(o1.getValue().equals(o2.getValue())) {
                    return 0;
                }
                return o1.getValue() > o2.getValue() ? -1 : 1;
            }
        });
        
        for(Map.Entry<SalesPerson, Integer> entry : salesProfits.entrySet()) {
            maxHeap.offer(entry);
        }
 
        System.out.println("Q3: Our top 3 best salesPersons are: ");

        int i = 0;
        double value = maxHeap.peek().getValue();
        while(!maxHeap.isEmpty() && i < 3) {
            Map.Entry<SalesPerson, Integer> entry = maxHeap.poll();
            if(entry.getValue() == value) {
                
            } else {
                i++;
                value = entry.getValue();
                if(i == 3) {
                    break;
                }
            }
            System.out.println(i+1 + 
                    ". salesPerson Id: " + entry.getKey().getSalesId() + 
                    ", total profits: " + entry.getValue());
        }
        System.out.println("");
        
        return salesProfits;
        
    }
    
    public void totalRevenue(Map<SalesPerson, Integer> salesProfits) {
        int totalRevenue = 0;
        for(Map.Entry<SalesPerson, Integer> entry : salesProfits.entrySet()) {
            totalRevenue += entry.getValue();
        }
        
        System.out.println("Q4: Our total revenue is: " + totalRevenue);
        System.out.println("");
    }
    
    public List<ProductData> generateOriginData() {
        Map<Integer, Product> productMap = DataStore.getInstance().getProductMap();
        Map<Integer, Item> itemMap = DataStore.getInstance().getItemMap();
        
        Map<Integer, Integer> productTargetPrice = new HashMap<>();
        for(Map.Entry<Integer, Product> entry : productMap.entrySet()) {
            int productId = entry.getKey();
            int targetPrice = entry.getValue().getTargetPrice();
            productTargetPrice.put(productId, targetPrice);
        }
        
        Map<Integer, Integer> productCount = new HashMap<>();
        for(Map.Entry<Integer, Item> entry : itemMap.entrySet()) {
            Item item = entry.getValue();
            int productId = item.getProductId();
            int quantity = item.getQuantity();
            productCount.put(productId, productCount.getOrDefault(productId, 0) + quantity);
        }
        
        Map<Integer, Integer> productTotalSalesPrice = new HashMap<>();
        for(Map.Entry<Integer, Item> entry : itemMap.entrySet()) {
            Item item = entry.getValue();
            int productId = item.getProductId();
            int quantity = item.getQuantity();
            int salesPrice = item.getSalesPrice();
            int total = salesPrice * quantity;
            productTotalSalesPrice.put(productId, productTotalSalesPrice.getOrDefault(productId, 0) + total);
        }
        
        Map<Integer, Double> productAverageSalesPrice = new HashMap<>();
        for(Integer productId : productMap.keySet()) {
            Integer total = productTotalSalesPrice.get(productId);
            Integer count = productCount.get(productId);
            double averageSalesPrice = ((double) total) / ((double) count);
            productAverageSalesPrice.put(productId, averageSalesPrice);
        }
        
        System.out.println("Q5:");
        System.out.println("PartI:The original data: ");
        
        //List<ProductData> res = new ArrayList<>();
        List<ProductData> res1 = new ArrayList<>();
        List<ProductData> res2 = new ArrayList<>();
        Map<Integer, Double> res1Map = new HashMap<>();
        Map<Integer, Double> res2Map = new HashMap<>();
        for(Map.Entry<Integer, Product> entry : productMap.entrySet()) {
            
            int productId = entry.getKey();
            int minPrice = entry.getValue().getMinPrice();
            int maxPrice = entry.getValue().getMaxPrice();
            int targetPrice = productTargetPrice.get(productId);
            double averageSalesPrice = productAverageSalesPrice.get(productId);
            double diffPrice = targetPrice - averageSalesPrice;
            
            ProductData productData = new ProductData(productId, minPrice, maxPrice, targetPrice, averageSalesPrice, diffPrice);
                if(productData.getTargetPrice()<productData.getAverageSalesPrice()){
                    res1.add(productData);
                    res1Map.put(productId, diffPrice);
                }else{
                    res2.add(productData);
                    res2Map.put(productId, diffPrice);
                }
                
        }
        System.out.println("1st part: How many product that average price larger than target price: "+res1.size());
        System.out.println("2nd part: How many product that target price larger than average price: "+res2.size());
        res1.addAll(res2);
        System.out.println("");
        System.out.println("Display 1st part Ranked by difference ");
        //
        System.out.println("===============================================================================================================================================================");
        Map<Integer, Double> sortedMap2 = new LinkedHashMap<Integer, Double>();
        List<Map.Entry<Integer, Double>> entryList2 = new ArrayList<Map.Entry<Integer, Double>>(
                res1Map.entrySet());
        Collections.sort(entryList2, new MapValueComparator());
 
        Iterator<Map.Entry<Integer, Double>> iter2 = entryList2.iterator();
        Map.Entry<Integer, Double> tmpEntry2 = null;
        while (iter2.hasNext()) {
            tmpEntry2 = iter2.next();
            sortedMap2.put(tmpEntry2.getKey(), tmpEntry2.getValue());
        }
        for (Map.Entry<Integer, Double> entry : sortedMap2.entrySet()) {
            //System.out.println(entry.getKey() + " ：" + entry.getValue());
            for (int i=0; i <res1.size();i++){
                if (entry.getKey().equals(res1.get(i).getProductId())){
                    System.out.println("||productId: " + res1.get(i).getProductId() + 
                    ",|| target price: " + res1.get(i).getTargetPrice() + 
                    ",|| sales price: " + res1.get(i).getAverageSalesPrice() + "\033[31;32;4m"+
                    ",|| diff price: " + res1.get(i).getDiffPrice()  +  "\033[0m"+
                    ",|| error: " + res1.get(i).getDiffPrice() / res1.get(i).getAverageSalesPrice() +
                    ",|| modified? " + ((res1.get(i).getDiffPrice() / res1.get(i).getAverageSalesPrice() <= 0.05 && res1.get(i).getDiffPrice() / res1.get(i).getAverageSalesPrice() >= -0.05) ? "No||" : "Yes||"));
                }
            
                                            }
            }
        System.out.println("===============================================================================================================================================================");
        //
        System.out.println("Display 2nd part Ranked by difference ");
        System.out.println("===============================================================================================================================================================");
        Map<Integer, Double> sortedMap = new LinkedHashMap<Integer, Double>();
        List<Map.Entry<Integer, Double>> entryList = new ArrayList<Map.Entry<Integer, Double>>(
                res2Map.entrySet());
        Collections.sort(entryList, new MapValueComparator());
 
        Iterator<Map.Entry<Integer, Double>> iter = entryList.iterator();
        Map.Entry<Integer, Double> tmpEntry = null;
        while (iter.hasNext()) {
            tmpEntry = iter.next();
            sortedMap.put(tmpEntry.getKey(), tmpEntry.getValue());
        }
        for (Map.Entry<Integer, Double> entry : sortedMap.entrySet()) {
            for (int i=0; i <res2.size();i++){
                if (entry.getKey().equals(res2.get(i).getProductId())){
                    System.out.println("||productId: " + res2.get(i).getProductId() + 
                    ",|| target price: " + res2.get(i).getTargetPrice() + 
                    ",|| sales price: " + res2.get(i).getAverageSalesPrice() + "\033[31;32;4m"+
                    ",|| diff price: " + res2.get(i).getDiffPrice()  +  "\033[0m"+
                    ",|| error: " + res2.get(i).getDiffPrice() / res2.get(i).getAverageSalesPrice() +
                    ",|| modified? " + ((res2.get(i).getDiffPrice() / res2.get(i).getAverageSalesPrice() <= 0.05 && res2.get(i).getDiffPrice() / res2.get(i).getAverageSalesPrice() >= -0.05) ? "No||" : "Yes||"));
                }
            
                                            }
            }
        System.out.println("===============================================================================================================================================================");
        return res1;
    }
    
    public void modifedData(List<ProductData> list) {
        if(list == null || list.isEmpty()) {
            return;
        }
        
        List<ProductData> res = new ArrayList<>();
        List<ProductData> res1 = new ArrayList<>();
        List<ProductData> res2 = new ArrayList<>();
        Map<Integer, Double> res1Map = new HashMap<>();
        Map<Integer, Double> res2Map = new HashMap<>();
        for(ProductData productData : list) {
            double averageSalesPrice = productData.getAverageSalesPrice();
            double diffPrice = productData.getDiffPrice();
            double error = diffPrice / averageSalesPrice;
            
            if(diffPrice / averageSalesPrice <= 0.05 && diffPrice / averageSalesPrice >= -0.05) {
            
            } else {
                
                int modifiedTargetPrice = 0;
                if(Math.floor(averageSalesPrice) + 0.5 > averageSalesPrice) {
                    modifiedTargetPrice = (int) Math.floor(averageSalesPrice);
                } else {
                    modifiedTargetPrice = (int) Math.ceil(averageSalesPrice);
                }
                productData.setTargetPrice(modifiedTargetPrice);
                productData.setDiffPrice(modifiedTargetPrice - averageSalesPrice);
            }
            res.add(productData);
        }
        System.out.println("");
        System.out.println("PartII:The modified data: ");
        
        for(ProductData productData : res) {
            int productId = productData.getProductId();
            int targetPrice = productData.getTargetPrice();
            double averageSalesPrice = productData.getAverageSalesPrice();
            double diffPrice = productData.getDiffPrice();
            if(productData.getTargetPrice()<productData.getAverageSalesPrice()){
                    res1.add(productData);
                    res1Map.put(productId, diffPrice);
                }else{
                    res2.add(productData);
                    res2Map.put(productId, diffPrice);
            }
        }
         System.out.println("1st part: How many product that average price larger than target price: "+res1.size());
        System.out.println("2nd part: How many product that target price larger than average price: "+res2.size());
        res1.addAll(res2);
         System.out.println("");
        System.out.println("Display 1st part Ranked by difference ");
         Map<Integer, Double> sortedMap2 = new LinkedHashMap<Integer, Double>();
        List<Map.Entry<Integer, Double>> entryList2 = new ArrayList<Map.Entry<Integer, Double>>(
                res1Map.entrySet());
        Collections.sort(entryList2, new MapValueComparator());
        System.out.println("===============================================================================================================================================================");
        Iterator<Map.Entry<Integer, Double>> iter2 = entryList2.iterator();
        Map.Entry<Integer, Double> tmpEntry2 = null;
        while (iter2.hasNext()) {
            tmpEntry2 = iter2.next();
            sortedMap2.put(tmpEntry2.getKey(), tmpEntry2.getValue());
        }
        for (Map.Entry<Integer, Double> entry : sortedMap2.entrySet()) {
            for (int i=0; i <res1.size();i++){
                if (entry.getKey().equals(res1.get(i).getProductId())){
                    System.out.println("||productId: " + res1.get(i).getProductId() + 
                    ",|| target price: " + res1.get(i).getTargetPrice() + 
                    ",|| sales price: " + res1.get(i).getAverageSalesPrice() + "\033[31;32;4m"+
                    ",|| diff price: " + res1.get(i).getDiffPrice()  +  "\033[0m"+
                    ",|| error: " + res1.get(i).getDiffPrice() / res1.get(i).getAverageSalesPrice() +
                    ",|| modified? " + ((res1.get(i).getDiffPrice() / res1.get(i).getAverageSalesPrice() <= 0.05 && res1.get(i).getDiffPrice() / res1.get(i).getAverageSalesPrice() >= -0.05) ? "No||" : "Yes||"));
                }                                            }}
        System.out.println("===============================================================================================================================================================");    
        
        
        System.out.println("");
        System.out.println("Display 2nd part Ranked by difference price:");
        
        System.out.println("===============================================================================================================================================================");
        Map<Integer, Double> sortedMap = new LinkedHashMap<Integer, Double>();
        List<Map.Entry<Integer, Double>> entryList = new ArrayList<Map.Entry<Integer, Double>>(
                res2Map.entrySet());
        Collections.sort(entryList, new MapValueComparator());
 
        Iterator<Map.Entry<Integer, Double>> iter = entryList.iterator();
        Map.Entry<Integer, Double> tmpEntry = null;
        while (iter.hasNext()) {
            tmpEntry = iter.next();
            sortedMap.put(tmpEntry.getKey(), tmpEntry.getValue());
        }
        for (Map.Entry<Integer, Double> entry : sortedMap.entrySet()) {
            for (int i=0; i <res2.size();i++){
                if (entry.getKey().equals(res2.get(i).getProductId())){
                    System.out.println("||productId: " + res2.get(i).getProductId() + 
                    ",|| target price: " + res2.get(i).getTargetPrice() + 
                    ",|| sales price: " + res2.get(i).getAverageSalesPrice() + "\033[31;32;4m"+
                    ",|| diff price: " + res2.get(i).getDiffPrice()  +  "\033[0m"+
                    ",|| error: " + res2.get(i).getDiffPrice() / res2.get(i).getAverageSalesPrice() +
                    ",|| modify required? " + ((res2.get(i).getDiffPrice() / res2.get(i).getAverageSalesPrice() <= 0.05 && res2.get(i).getDiffPrice() / res2.get(i).getAverageSalesPrice() >= -0.05) ? "No||" : "Yes||"));
                }
            
                                            }
            }
               System.out.println("===============================================================================================================================================================");
        
    }

    class MapValueComparator implements Comparator<Map.Entry<Integer, Double>> {

        @Override
    public int compare(Entry<Integer, Double> me1, Entry<Integer, Double> me2) {
 
        //from small to big
        return me2.getValue().compareTo(me1.getValue());//from big to small
    }
    }
    
    
}
