package com.kodilla.good.patterns;

import java.util.HashMap;
import java.util.Map;

public class ExtraFoodShop implements Supplier {

    private static final String CLAMS = "Clams ";
    private static final String PRAWNS = "Prawns ";
    private static final String OYSTERS = "Oysters ";
    private static final String COMPANY = "ExtraFoodShop ";
    public Map<String, Integer> listOfProducts = new HashMap<>();

    private int quantityOfClams;
    private int quantityOfPrawns;
    private int quantityOfOysters;


    public ExtraFoodShop(int quantityOfClams, int quantityOfPrawns, int quantityOfOysters) {
        this.quantityOfClams = quantityOfClams;
        this.quantityOfPrawns = quantityOfPrawns;
        this.quantityOfOysters = quantityOfOysters;
    }

    public int getQuantityOfClams() {
        return quantityOfClams;
    }

    public int getQuantityOfPrawns() {
        return quantityOfPrawns;
    }

    public int getQuantityOfOysters() {
        return quantityOfOysters;
    }

    public Order process() {
        listOfProducts.put(CLAMS, getQuantityOfClams());
        listOfProducts.put(OYSTERS, getQuantityOfOysters());
        listOfProducts.put(PRAWNS, getQuantityOfPrawns());

        return new Order(listOfProducts, COMPANY);
    }
}