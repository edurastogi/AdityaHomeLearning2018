package com.general;

import java.util.HashMap;
import java.util.Map;

public class UtilityClass {

    public static Map<Character,Integer> getStringCharMap(String S) {

        Map<Character, Integer> sMap = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            Integer value = sMap.get(c);
            if (value != null) {
                value = value + 1;
            } else {
                value = 1;
            }
            sMap.put(c, value);
        }
        return sMap;
    }
}
