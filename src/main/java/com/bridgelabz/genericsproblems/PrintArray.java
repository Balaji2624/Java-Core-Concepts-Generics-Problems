package com.bridgelabz.genericsproblems;

class PrintArray {

    // Method to print an Integer array
    public static void toPrint(Integer[] array) {
        for (Integer element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Method to print a Double array
    public static void toPrint(Double[] array) {
        for (Double element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Method to print a Character array
    public static void toPrint(Character[] array) {
        for (Character element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Arrays of Integer, Double, and Character types
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = {'A', 'B', 'C', 'D', 'E'};

        // Printing the arrays using the overloaded toPrint methods
        System.out.println("Integer Array:");
        toPrint(intArray);

        System.out.println("Double Array:");
        toPrint(doubleArray);

        System.out.println("Character Array:");
        toPrint(charArray);
    }
}

