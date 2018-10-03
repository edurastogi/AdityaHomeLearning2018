package com.general;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class Permutation {
    public static void main(String[] args) {
        String a = "abcd";
        String b = "bcda";
        System.out.println(isPermutation(a, b));
    }

    private static boolean isPermutation(@NotNull String a, String b) {
        if (a.length() != b.length()) return false;
        boolean isPer = true;
        Map<String, String> aMap = new HashMap<>();
        String[] aArray = a.split("(?!^)");
        String[] bArray = b.split("(?!^)");
        for (String s : aArray) {
            //TODO: This will will not work in case of repeating alphabets,
            aMap.put(s, s);
        }
        for (String s : bArray) {
            if (!aMap.containsKey(s)) {
                isPer = false;
                break;
            }else {

                aMap.remove(s);
            }
        }
        return isPer;
    }
}
