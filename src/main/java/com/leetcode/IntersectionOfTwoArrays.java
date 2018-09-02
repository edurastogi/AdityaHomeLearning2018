package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {

        int[] num1 = {4, 9, 5};
        int[] num2 = {9, 4, 9, 8, 4};
        IntersectionOfTwoArrays a = new IntersectionOfTwoArrays();
        int[] intersectionArray = a.intersect(num1, num2);
        System.out.println(Arrays.toString(intersectionArray));
        /*List<Integer> myList = new ArrayList<>(asList(3,5,6,7,8,4,3,4));
        System.out.println(myList);
        boolean flag = myList.contains(4);
        System.out.println("List contain : " + flag);
        myList.remove(Integer.valueOf(4));
        System.out.println(myList);
        System.out.println("List contain : " + flag);
        myList.remove(Integer.valueOf(4));
        System.out.println(myList);
        System.out.println("List contain : " + flag);
        int[] arr = myList.stream().mapToInt(i -> i).toArray();*/
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> intersectionList = new ArrayList<>();
        List<Integer> nums1List = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        boolean flag;

        for (int i = 0; i < nums2.length; i++) {
            flag = nums1List.contains(nums2[i]);
            if (flag) {
                nums1List.remove(Integer.valueOf(nums2[i]));
                intersectionList.add(Integer.valueOf(nums2[i]));
            }
        }
        int[] result = intersectionList.stream().mapToInt(i -> i).toArray();
        return result;
    }

    public int[] intersectOptimum(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int p1 = 0, p2 = 0, count = 0;
        int[] tmp = new int[Math.max(nums1.length, nums2.length)];
        while (p1 != nums1.length && p2 != nums2.length) {
            if (nums1[p1] == nums2[p2]) {
                tmp[count] = nums1[p1];
                count++;
                p1++;
                p2++;
            } else if (nums1[p1] < nums2[p2]) p1++;
            else p2++;
        }
        return Arrays.copyOf(tmp, count);
    }
}

