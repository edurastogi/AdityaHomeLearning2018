package leetcode;

import java.util.Arrays;

/*
Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:

Input: [2,2,1]
Output: 1
*/


public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {2,2,1};
        int num = singleNumber(nums);
        System.out.println(num);
    }

    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int count = 1;
        int prev = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (prev == nums[i]) count++;
            else if (prev != nums[i] && count == 2) {
                prev = nums[i];
                count = 1;
            } else if (prev != nums[i] && count == 1) {
                break;
            }
        }
        return prev;
    }
}
