package com.general;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapTest{
    public static void main(String[] args){

        //HashMap allows null values
        Map<String,String> testMap = new HashMap<>();
        testMap.put(null,"my null string");
        System.out.println(testMap.get(null));

        //TreeMap do not allow null values
        Map<String,String > testTreeMap = new TreeMap<>();
        testTreeMap.put(null,"my null string");
        System.out.println(testTreeMap.get(null));

    }
}
