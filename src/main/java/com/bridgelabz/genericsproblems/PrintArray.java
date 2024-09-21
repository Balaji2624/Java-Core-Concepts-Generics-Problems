package com.bridgelabz.genericsproblems;

class PrintArray {

    public static <T> void toPrint(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {

        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = {'A', 'B', 'C', 'D', 'E'};
        
        System.out.println("Integer Array:");
        toPrint(intArray);

        System.out.println("Double Array:");
        toPrint(doubleArray);

        System.out.println("Character Array:");
        toPrint(charArray);
    }
}

