package com.kodilla.testing.shape;

class Triangle implements Shape{
    private String name = "Triangle";
    private double giveA;
    private double giveH;

    Triangle(double giveA,double giveH) {

        this.giveA=giveA;
        this.giveH=giveH;
    }

    @Override
    public String getShapeName() {
        return this.name;
    }

    @Override
    public double getField() {
        return giveA*giveH/2;

    }
}


