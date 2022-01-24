package com.kodilla.good.patterns;

public class GlutenFreeShop implements Supplier {
    private final String companyName = "GlutenFreeShop";

    public void process(com.kodilla.good.patterns.Order order) {
        System.out.println("Thanks for your order on behalf of \"" + companyName + "\"." +
                " I hope you will be pleased with our products." + " Just to confirm your ordered: " +
                order.getCount() + " of " + order.getProduct() + " . Your order is being processed.");
    }
}