package com.general;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PracticeStream {
    public static void main(String[] args){
        //Map - Filter - Reduce

        //Creating a stream
        /*List<String> strings = Arrays.asList("one","two","three","four","five");
        List<String> result = new ArrayList<>();

        Consumer<String> c1 = (p->result.add(p));
        Consumer<String> c2 = (p -> System.out.println(p));

        //Stream<String> stream = strings.stream();
        strings.stream().forEach(c1.andThen(c2));

        //Filtering
        Stream<String> filtered = strings.stream().filter(p ->p.contains("o"));
        filtered.forEach(c2);*/

        //Predicate Combination example
        /*Predicate<Integer> p1 = i -> i > 20;
        Predicate<Integer> p2 = i -> i < 30;
        Predicate<Integer> p3 = i -> i == 0;

        Predicate<Integer> p4 = p1.and(p2).or(p3); //(p1 AND p2) OR p3
        Predicate<Integer> p5 = p3.or(p1).and(p2); //(p3 OR p1) AND p2

        List<Integer> testList = Arrays.asList(0,5,10,20,25,26,30,40,50,60);
        testList.stream().filter(p4).forEach(p-> System.out.println(p));

        //isEqual Predicate
        Predicate<String> p = Predicate.isEqual("two");
        Stream<String> stream1 = Stream.of("one","two","three");

        stream1.filter(p).forEach(q-> System.out.println(q));
*/

        //lazy loading example
        Stream<String> stream = Stream.of("one","two","three","four","five");
        Predicate<String> p1 = Predicate.isEqual("two");
        Predicate<String> p2 = Predicate.isEqual("three");
        List<String> list = new ArrayList<>();

        //nothing will execute in this step
        /*stream.peek(x -> System.out.println(x))
                .filter(p1.or(p2))
                .peek(y ->list.add(y));*/

        //this will execute both peek and forEach
        stream.peek(x -> System.out.println(x))
                .filter(p1.or(p2))
                .forEach(y ->list.add(y));

        System.out.println("Done!");
        System.out.println("size = " + list.size());



    }
}
