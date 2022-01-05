package com.kodilla.testing.shape;
import java.util.*;


public class ShapeCollector {
    private List<Shape> figureList = new ArrayList<>();

    public boolean addFigure(Shape shape) {
        figureList.add(shape);
        return true;
    }

    public boolean removeFigure(Shape shape) {
        if (figureList.contains(shape)) {
            figureList.remove(shape);
            return true;
        } else {
            return false;
        }
    }

    public Shape getFigure(int n) {
        return figureList.get(n);
    }
    public String showFigures() {
        String shapeName ="";
        for ( int i =0; i<figureList.size(); i++) {
            shapeName = shapeName + figureList.get(i).getShapeName();
            if((figureList.size()-1)!=i) {
                shapeName = shapeName + " ";
            }
        }
        return shapeName;
    }
}

