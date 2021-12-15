package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();
        int addResult = calculator.add(15, 5);
        int substractResult = calculator.subtract(15, 5);


        if (addResult == 20) {
            System.out.println("add() method test ok");
        } else {
            System.out.println("add() method - error");
        }

        if (substractResult == 10) {
            System.out.println("substract() method test ok");
        } else {
            System.out.println("add() method - error");
        }
    }
}


