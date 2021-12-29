package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private List<Shape> shape= new ArrayList<>();


    public void addFigure(Shape shape){
        shape.add(shape);
    }

    public boolean removeFigure(Shape shape){
        return shape.remove(shape);
    }

    public Shape getFigure(int n){
        if(n <shape.size() && n>=0){
            return shape.get(n);
        } else {
            return null;
        }
    }

    public void showFigures(){
        System.out.println(shape.toString());
    }

}