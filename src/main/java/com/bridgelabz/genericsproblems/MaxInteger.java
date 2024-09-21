package com.bridgelabz.genericsproblems;

class MaxInteger {

    public static Integer findMax(Integer a, Integer b, Integer c) {
        Integer max = a; 


        if (b.compareTo(max) > 0) {
            max = b;
        }

        if (c.compareTo(max) > 0) {
            max = c;
        }

        return max;
    }


    public static void main(String[] args) {

        Integer a1 = 9, b1 = 3, c1 = 5;
        System.out.println("Max of (9, 3, 5) is: " + findMax(a1, b1, c1));

        Integer a2 = 3, b2 = 12, c2 = 7;
        System.out.println("Max of (3, 12, 7) is: " + findMax(a2, b2, c2));

    }
}

