package com.bridgelabz.genericsproblems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxIntegerTest {
    @Test
    public void testMaximumInteger() {
        MaxInteger<Integer> intFinder = new MaxInteger<>(9, 3, 5);
        Integer expectedMax = 9;
        assertEquals(expectedMax, intFinder.testMaximum());
    }

    @Test
    public void testMaximumFloat() {
        MaxInteger<Float> floatFinder = new MaxInteger<>(9.1f, 3.2f, 5.2f);
        Float expectedMax = 9.1f;
        assertEquals(expectedMax, floatFinder.testMaximum());
    }

    @Test
    public void testMaximumString() {
        MaxInteger<String> stringFinder = new MaxInteger<>("Apple", "Peach", "Banana");
        String expectedMax = "Peach"; // Alphabetically "Peach" is the greatest
        assertEquals(expectedMax, stringFinder.testMaximum());
    }
}
