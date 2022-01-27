package com.kodilla.good.patterns;


import java.util.Map;

public class Order {
    private Map<String, Integer> listOfProducts;
    private String nameOfCompany;

    public Order(Map<String, Integer> listOfProducts, String nameOfCompany) {
        this.listOfProducts = listOfProducts;
        this.nameOfCompany = nameOfCompany;
    }

    public void printOrder() {
        System.out.println(nameOfCompany);
        for (Map.Entry<String, Integer> entry : listOfProducts.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println();
    }
}

