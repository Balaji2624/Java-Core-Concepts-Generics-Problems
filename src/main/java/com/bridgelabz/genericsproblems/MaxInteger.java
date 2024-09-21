package com.bridgelabz.genericsproblems;

class MaxInteger<T extends Comparable<T>> {
    private T[] elements;

    // Parameterized constructor to initialize the generic array
    @SafeVarargs
    public MaxInteger(T... elements) {
        this.elements = elements;
    }

    // Instance method to call the static testMaximum method
    public T testMaximum() {
        return MaxInteger.testMaximum(elements);
    }

    // Static generic method to find the maximum of any number of Comparable objects
    @SafeVarargs
    public static <T extends Comparable<T>> T testMaximum(T... elements) {
        if (elements.length == 0) {
            throw new IllegalArgumentException("No elements provided");
        }

        T max = elements[0]; // Initialize max with the first element

        // Loop through all elements to find the maximum
        for (T element : elements) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
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

