package com.general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class PracticeStream {
    public static void main(String[] args){
        //Map - Filter - Reduce

        //Creating a stream
        List<String> strings = Arrays.asList("one","two","three","four","five");
        List<String> result = new ArrayList<>();

        Consumer<String> c1 = (p->result.add(p));
        Consumer<String> c2 = (p -> System.out.println(p));

        //Stream<String> stream = strings.stream();
        strings.stream().forEach(c1.andThen(c2));

        //Filtering
        Stream<String> filtered = strings.stream().filter(p ->p.contains("o"));
        filtered.forEach(c2);



    }
}
