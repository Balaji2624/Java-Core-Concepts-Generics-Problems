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

    // Test case for Integer with more than three elements
    @Test
    public void WhenGivenMoreThanThreeIntegers_ShouldReturnMax_Integer() {
        MaxInteger<Integer> maxNum = new MaxInteger<>(10, 20, 5, 30, 15);
        assertEquals(30, maxNum.testMaximum(), "Max should be 30");
    }

    // Test case for Float with more than three elements
    @Test
    public void WhenGivenMoreThanThreeFloats_ShouldReturnMax_Float() {
        MaxInteger<Float> maxNum = new MaxInteger<>(5.5f, 10.5f, 9.9f, 15.6f, 12.2f);
        assertEquals(15.6f, maxNum.testMaximum(), "Max should be 15.6");
    }

    // Test case for String with more than three elements
    @Test
    public void WhenGivenMoreThanThreeStrings_ShouldReturnMax_String() {
        MaxInteger<String> maxNum = new MaxInteger<>("Apple", "Peach", "Banana", "Zebra", "Lion");
        assertEquals("Zebra", maxNum.testMaximum(), "Max should be Zebra");
    }
}
