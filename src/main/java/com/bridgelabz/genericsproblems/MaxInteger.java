package com.bridgelabz.genericsproblems;

class MaxInteger {

        public static Float findMax(Float a, Float b, Float c) {
            Float max = a;

            if (b.compareTo(max) > 0) {
                max = b;
            }

            if (c.compareTo(max) > 0) {
                max = c;
            }

            return max;
        }

    public static void main(String[] args) {

        float a1 = 9.1f, b1 = 3.2f, c1 = 5.2f;
        System.out.println("Max of (9.1, 3.2, 5.2) is: " + findMax(a1, b1, c1));

    }
}

