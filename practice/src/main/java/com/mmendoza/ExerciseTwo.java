package com.mmendoza;

import java.util.Arrays;

public class ExerciseTwo {
    public static void main(String[] args) {
        int[] input = {3, 2, 3};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(input, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] newNums = new int[2]; /* It will always be two positions */
        for (int Ce = 0; Ce < nums.length - 1; Ce++) {
            for (int Ci = Ce + 1; Ci < nums.length; Ci++) {
                if (isEqualToTarget(nums[Ce], nums[Ci], target)) {
                    newNums[0] = Ce; /* will always be in the first position */
                    newNums[1] = Ci; /* will always be in the second position */
                }
            }
        }
        return newNums;
    }

    public static boolean isEqualToTarget(int firstNumber, int secondNumber, int target) {
        return firstNumber + secondNumber == target;
    }
}
