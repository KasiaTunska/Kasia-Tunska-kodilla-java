package com.kodilla.testing.shape;

import static java.lang.Math.pow;

    class  Square implements Shape {
        private String name = "Square";
        private double a;

        Square(double squareField) {
            this.a = squareField;
        }

        public String getShapeName() {
            return name;
        }

        public double getField() {
            return pow(a, 2);
        }

    }

