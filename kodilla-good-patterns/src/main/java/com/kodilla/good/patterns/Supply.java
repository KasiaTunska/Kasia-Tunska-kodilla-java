package com.kodilla.good.patterns;

import java.util.List;

public class Supply {

    OrderProcessor orderProcessor = new OrderProcessor();

    public void deliveryOfGoods() {
        orderProcessor.addToOrderList(new HealthyShop(1, 2));
        orderProcessor.addToOrderList(new ExtraFoodShop (2, 9,4));
        orderProcessor.addToOrderList(new GlutenFreeShop(5, 1, 5));
    }

    public void printDeliveryOfGoods() {
        List<Order> supplierOrderList = orderProcessor.getOrderList();
        for (int i = 0; i < supplierOrderList.size(); i++) {
            supplierOrderList.get(i).printOrder();
        }
    }
}

