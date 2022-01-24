package com.kodilla.good.patterns;


public class Application {
    public static void main(String[] args) {
        OrderProcessor orderProcessor = new OrderProcessor(new GlutenFreeShop(),
                new Order("Non gluten bread", 10));
        orderProcessor.makeOrder();
        orderProcessor.checkOrder();

    }
}