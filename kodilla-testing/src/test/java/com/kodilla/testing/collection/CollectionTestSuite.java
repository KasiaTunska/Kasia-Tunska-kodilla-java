package com.kodilla.testing.collection;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CollectionTestSuite {


    @DisplayName("\"When create OddNumbersExterminator with empty firstList, \" +\n" +
            "                    \"then exterminate should return an empty List\"")
    @Test
    void testOddNumbersExterminatorEmptyList(){

  //Given
       OddNumbersExterminator exterminator = new OddNumbersExterminator();
       List <Integer> firstList = new ArrayList<Integer>();
       List<Integer> ourList = new ArrayList<Integer>();

 //When
        List <Integer> result = exterminator.exterminate(firstList);

        //Then
        assertEquals(result, ourList);

    }
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName("  \"When create OddNumbersExterminator with data, \" +\n" +
            "                    \"then exterminate should return a List of even numbers\" ")

    @Test
    void testOddNumbersExterminatorNormalList () {
  //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List <Integer> fullList = new ArrayList<Integer>(Arrays.asList(4,5,10,33,46, 77, 100, 81));
        List<Integer> ourList = new ArrayList<Integer>(Arrays.asList(4,10,46,100));
//When
        List <Integer> result = exterminator.exterminate(fullList);

        //Then
        Assertions.assertEquals(ourList, result);
    }
}


