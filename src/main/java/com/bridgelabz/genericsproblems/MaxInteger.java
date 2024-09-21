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

        // Find Maximium String
        public static String findMax(String a, String b, String c) {
            String max = a;

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

        Float a2 = 3.5f, b2 = 12.6f, c2 = 7.4f;
        System.out.println("Max of (3.5, 12.6, 7.4) is: " + findMax(a2, b2, c2));

        Float a3 = 2.9f, b3 = 4.8f, c3 = 10.2f;
        System.out.println("Max of (2.9, 4.8, 10.2) is: " + findMax(a3, b3, c3));

        // String
        String a4 = "Apple", b4 = "Peach", c4 = "Banana";
        System.out.println("Max of (Apple, Peach, Banana) is: " + findMax(a4, b4, c4));

    }
}

