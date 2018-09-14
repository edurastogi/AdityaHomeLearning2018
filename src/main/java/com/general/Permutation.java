package com.general;

import java.util.HashMap;
import java.util.Map;

public class Permutation {
    public static void main(String[] args) {
        String a = "abcd";
        String b = "bpda";

        System.out.println(isPermutation(a,b));
    }

    public  static boolean isPermutation (String a , String b){
        if(a.length() != b.length()) return false;
        boolean isPer = true;
        Map<String, String> aMap = new HashMap<>();
        String[] aArray = a.split("(?!^)");
        String[] bArray = b.split("(?!^)");
        for(String s : aArray){
            aMap.put(s,s);
        }
        for(String s : bArray){
            if (!aMap.containsKey(s)) {
                isPer = false;
                break;
            }
        }
        return isPer;
    }
}
