package com.leetcode;

public class LongestSubstring {
    public static void main(String args[]) {
        LongestSubstring instance = new LongestSubstring();
        String s = "abcabcd";
        int subStringLength = instance.lengthOfLongestSubstring(s);
        System.out.println(subStringLength);
    }

    public int lengthOfLongestSubstring(String s) {
        char[] inputSArray = s.toCharArray();
        int inputSLen = inputSArray.length;
        String finalS = "";
        String tempS;
        for (int i = 0; i < inputSLen; i++) {
            tempS = String.valueOf(inputSArray[i]);
            for (int j = i + 1; j < inputSLen; j++) {
                if (tempS.indexOf(inputSArray[j]) == -1) {
                    tempS = tempS + inputSArray[j];
                } else {
                    break;
                }
            }
            if (finalS.length() < tempS.length()) {
                finalS = tempS;
            }
        }
        return finalS.length();
    }
}
