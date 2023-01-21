package org.example;


import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Products> productsList = new ArrayList<>();

    public List<Products> getProductsList() {
        return productsList;
    }

    public void addProducts(Products product){
        productsList.add(product);
    }

    public VendingMachine (List<Products> productsList){
        this.productsList  = productsList;
    }
}
