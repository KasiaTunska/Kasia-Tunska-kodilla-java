package com.kodilla.patterns.strategy.social;

import com.com.kodilla.patterns.strategy.social.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {

        //Given
        User wiktor = new Millenials("Wiktor");
        User maja = new YGeneration("Maja");
        User hanna = new ZGeneration("Hanna");

        //When
        String mikolajPublisher = wiktor.sharePost();
        System.out.println("Mikolaj use: " + mikolajPublisher);
        String olaPublisher = maja.sharePost();
        System.out.println("Ola use: " + olaPublisher);
        String hannaPublisher = hanna.sharePost();
        System.out.println("Hanna use: " + hannaPublisher);

        //Then
        assertEquals("Fac" +
                "ebook", mikolajPublisher);
        assertEquals("Twitter", olaPublisher);
        assertEquals("Snapchat", hannaPublisher);
    }

    @Test
    void testIndividualSharingStrategy() {

        //Given
        User adrianna = new Millenials("Adrianna");

        //When
        String adriannaPublisher = adrianna.sharePost();
        System.out.println("Adrianna use: " + adriannaPublisher);
        adrianna.setSocialPublisher(new TwitterPublisher());
        adriannaPublisher = adrianna.sharePost();
        System.out.println("Now Adrianna use: " + adriannaPublisher);

        //Then
        assertEquals("Twitter", adriannaPublisher);
    }
}