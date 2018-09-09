package com.leetcode;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        System.out.println(Arrays.toString(nums));
        MoveZeros m = new MoveZeros();
        m.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
        /*boolean swap;
        int temp;
        for (int i = 0; i < nums.length; i++) {
            swap = false;
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] == 0 && nums[j + 1] != 0) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swap = true;
                }
            }
            System.out.println(Arrays.toString(nums));
            if (!swap) break;
        }*/
    }

    public void moveZeroes(int[] nums) {
        boolean swap;
        int temp;
        for (int i = 0; i < nums.length; i++) {
            swap = false;
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] == 0 && nums[j + 1] != 0) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap) break;
        }
    }
}
