package com.kodilla.good.patterns;

import java.util.ArrayList;
import java.util.List;



public class OrderProcessor {

    private List<Order> orderList = new ArrayList<>();

    public void addToOrderList(Supplier supplier) {
        orderList.add(supplier.process());

    }

    public List<Order> getOrderList() {
        return orderList;
    }
}
