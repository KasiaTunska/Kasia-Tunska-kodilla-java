package com.kodilla.good.patterns;


import java.util.HashMap;
import java.util.Map;

public class HealthyShop implements Supplier {

    private static final String APPLE = "Apple ";
    private static final String LEMON = "Lemon ";
    private static final String COMPANY = "HealthyShop ";
    public Map<String, Integer> listOfProducts = new HashMap<>();

    private int quantityOfApple;
    private int quantityOfLemon;

    public HealthyShop(int quantityOfApple, int quantityOfLemon) {
        this.quantityOfApple = quantityOfApple;
        this.quantityOfLemon = quantityOfLemon;
    }

    public int getQuantityOfApple() {
        return quantityOfApple;
    }

    public int getQuantityOfLemon() {
        return quantityOfLemon;
    }

    public Order process() {
        listOfProducts.put(APPLE, getQuantityOfApple());
        listOfProducts.put(LEMON, getQuantityOfLemon());
        return new Order(listOfProducts, COMPANY);
    }

}