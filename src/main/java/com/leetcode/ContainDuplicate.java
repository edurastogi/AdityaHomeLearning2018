package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class ContainDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        ContainDuplicate c = new ContainDuplicate();
        System.out.println(c.containDuplicate(nums));

    }
    public boolean containDuplicate(int[] nums){
        Set<Integer> mySet = new HashSet<>();
        for (int i = 0; i < nums.length ; i++) {
            if(mySet.contains(nums[i])) return true;
            mySet.add(nums[i]);
        }
        return false;
    }
}
