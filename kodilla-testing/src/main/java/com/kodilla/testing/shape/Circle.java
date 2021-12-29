package com.kodilla.testing.shape;

import static java.lang.Math.PI;
import static java.lang.Math.pow;


class Circle implements Shape {
    private String name = "Circle";
    private double r;

    Circle(double r) {
        this.r = r;
    }
    public String getShapeName() {
        return name;
    }

    public double getField() {
        return PI * pow(r, 2);
    }

}
