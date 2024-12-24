package com.mmendoza;

import java.util.Arrays;

class ExerciseOne {
    public static void main(String[] args) {
        /* input */
        int[] gifts = new int[]{25, 64, 9, 4, 100}; /* final state -> [5,8,9,4,3] */
        pickGifts(gifts, 4); /* output 29 */
    }
    public static long pickGifts(int[] gifts, int k) {
        for (int i = 0; i < k; i++)
            gifts[pos(gifts, max(gifts))] = (int) Math.sqrt(max(gifts));
        return Arrays.stream(gifts).asLongStream().sum();
    }
    /* get position of max in array */
    private static int pos(int[] gifts, int max) {
        int pos = 0;
        for (int i = 0; i < gifts.length; i++) {
            if (gifts[i] == max)
                pos = i;
        }
        return pos;
    }
    /* get max in array */
    private static int max(int[] gifts) {
        int max = gifts[0];
        for (int i = 1; i < gifts.length; i++) {
            if (gifts[i] > max)
                max = gifts[i];
        }
        return max;
    }
}