package com.kodilla.testing.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ShapeCollectorTestSuite {

    @DisplayName("First test")
    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Shape shape = new Circle(1);
        //When
        collector.addFigure(shape);
        //Then
        assertEquals(1, collector.getTheList().size());
    }

    @DisplayName("Second test")
    @Test
    public void testRemoveFigure() {
        //Give
        ShapeCollector collector = new ShapeCollector();
        Shape shape = new Circle(1);
        //When
        collector.removeFigure(shape);
        //Then
        assertEquals(0, collector.getTheList().size());
    }

    @DisplayName("Third test")
    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Shape shape = new Circle(1);
        //When
        collector.addFigure(shape);
        Shape theShape = collector.getFigure(0);
        //Then
        assertEquals(shape, theShape);
    }

    @DisplayName("Fourth test")
    @Test
    public void testShowFigureToString() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Shape shape = new Circle(1);
        //When
        collector.addFigure(shape);                     //add?

        ArrayList<Shape> theSecondList = new ArrayList<>();
        theSecondList.add(shape);
        List<Shape> theThirdList = collector.getTheList();
        //Then
        Assertions.assertEquals(theSecondList.toString(), theThirdList.toString());
    }
}