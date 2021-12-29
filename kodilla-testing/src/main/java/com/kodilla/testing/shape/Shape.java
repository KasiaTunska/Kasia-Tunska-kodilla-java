package com.kodilla.testing.shape;

import java.util.Collection;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public interface Shape {

    String getShapeName();

    double getField();

}

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

    public class ShapeCollector {

        private List<Shape> shapes= new ArrayList<>();


        public void addFigure(Shape shape){
            shapes.add(shape);
        }

        public boolean removeFigure(Shape shape){
            return shapes.remove(shape);
        }

        public Shape getFigure(int n){
            if(n <shapes.size() && n>=0){
                return shapes.get(n);
            } else {
                return null;
            }
        }

        public void showFigures(){
            System.out.println(shapes.toString());
        }

    }
