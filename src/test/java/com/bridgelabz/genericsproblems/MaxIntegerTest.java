package com.bridgelabz.genericsproblems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxIntegerTest {
    // TC 1.1 :
    @Test
    public void findMax_whenMaxIsAtFirstPosition_shouldReturnFirstValue() {
        Integer a = 10, b = 5, c = 7;
        assertEquals(a, MaxInteger.findMax(a, b, c), "Max should be at the first position");
    }

    //TC 1.2:
    @Test
    public void findMax_whenMaxIsAtSecondPosition_shouldReturnSecondValue() {
        Integer a = 3, b = 12, c = 7;
        assertEquals(b, MaxInteger.findMax(a, b, c), "Max should be at the second position");
    }

    //TC 1.3 :
    @Test
    public void findMax_whenMaxIsAtThirdPosition_shouldReturnThirdValue() {
        Integer a = 2, b = 4, c = 10;
        assertEquals(c, MaxInteger.findMax(a, b, c), "Max should be at the third position");
    }

    // TC 2.1 :
    @Test
    public void findMax_whenMaxIsAtFirstPosition_shouldReturnFirstValue() {
        Float a = 9.5f, b = 3.2f, c = 5.7f;
        assertEquals(a, MaxInteger.findMax(a, b, c), "Max should be at the first position");
    }

    // TC 2.2 :
    @Test
    public void findMax_whenMaxIsAtSecondPosition_shouldReturnSecondValue() {
        Float a = 3.5f, b = 12.6f, c = 7.4f;
        assertEquals(b, MaxInteger.findMax(a, b, c), "Max should be at the second position");
    }

    // TC 2.3 :
    @Test
    public void findMax_whenMaxIsAtThirdPosition_shouldReturnThirdValue() {
        Float a = 2.9f, b = 4.8f, c = 10.2f;
        assertEquals(c, MaxInteger.findMax(a, b, c), "Max should be at the third position");
    }

    // TC 3.1 :
    @Test
    public void findMax_whenMaxIsAtFirstPosition_shouldReturnFirstValue() {
        String a = "Peach", b = "Apple", c = "Banana";
        assertEquals(a, MaxInteger.findMax(a, b, c), "Max should be at the first position");
    }

    // TC 3.2 :
    @Test
    public void findMax_whenMaxIsAtSecondPosition_shouldReturnSecondValue() {
        String a = "Apple", b = "Peach", c = "Banana";
        assertEquals(b, MaxInteger.findMax(a, b, c), "Max should be at the second position");
    }

    // TC 3.3 :
    @Test
    public void findMax_whenMaxIsAtThirdPosition_shouldReturnThirdValue() {
        String a = "Apple", b = "Banana", c = "Peach";
        assertEquals(c, MaxInteger.findMax(a, b, c), "Max should be at the third position");
    }
}
