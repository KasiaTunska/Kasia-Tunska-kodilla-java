package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    List<Integer> evenNumbersList = new ArrayList<Integer>();
    List<Integer> oddNumbersList = new ArrayList <Integer>();

    public List<Integer> exterminate(List<Integer> numbers) {
       for (int number : numbers) {
           if (number % 2 == 0) {
                evenNumbersList.add(number);
           } else {
               oddNumbersList.add (number);
           }
       }
       return evenNumbersList;
    }

}


