package com.general;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arrayWithDuplicate = {1,3,3,4,5,6,6,7,7};
        System.out.println("Input : " + Arrays.toString(arrayWithDuplicate));

        List<Integer> arrayList = Arrays.stream(arrayWithDuplicate).boxed().collect(Collectors.toList());

        HashSet<Integer> hSet = new HashSet<>();
        hSet.addAll(arrayList);
        int[] output = hSet.stream().mapToInt(i ->i).toArray();

        System.out.println("Output: " +Arrays.toString(output));
    }
}
