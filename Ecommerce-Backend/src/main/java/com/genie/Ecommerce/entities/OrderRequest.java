package com.genie.Ecommerce.entities;

import java.util.Map;

public class  OrderRequest {

    //Key-product id
    //Value-quantity
    private Map<Long,Integer> productQuantities;

    private double totalAmount;

    public Map<Long, Integer> getProductQuantities() {
        return productQuantities;
    }

    public void setProductQuantities(Map<Long, Integer> productQuantities) {
        this.productQuantities = productQuantities;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
