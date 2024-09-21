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
}
