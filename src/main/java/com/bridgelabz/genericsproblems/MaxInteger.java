package com.bridgelabz.genericsproblems;

class MaxInteger<T extends Comparable<T>> {
    private T a, b, c;

    // Parameterized constructor to initialize the variables
    public MaxInteger(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Instance method to call the static testMaximum method
    public T testMaximum() {
        return MaxInteger.testMaximum(this.a, this.b, this.c);
    }

    // Static generic method to find the maximum of three Comparable objects
    public static <T extends Comparable<T>> T testMaximum(T a, T b, T c) {
        T max = a;

        if (b.compareTo(max) > 0) {
            max = b;
        }

        if (c.compareTo(max) > 0) {
            max = c;
        }

        return max;
    }

    public static void main(String[] args) {
        // Test cases using the generic class

        // Integer Test
        MaxInteger<Integer> intFinder = new MaxInteger<>(9, 3, 5);
        System.out.println("Max of (9, 3, 5) is: " + intFinder.testMaximum());

        // Float Test
        MaxInteger<Float> floatFinder = new MaxInteger<>(9.1f, 3.2f, 5.2f);
        System.out.println("Max of (9.1, 3.2, 5.2) is: " + floatFinder.testMaximum());

        // String Test
        MaxInteger<String> stringFinder = new MaxInteger<>("Apple", "Peach", "Banana");
        System.out.println("Max of (Apple, Peach, Banana) is: " + stringFinder.testMaximum());
    }
}

