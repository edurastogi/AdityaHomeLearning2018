package java8.stream.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BasicStreamExamples{
    public static void main(String[] args){
        List<String> items = new ArrayList<String>();
        items.add("one");
        items.add("two");
        items.add("three");

        //getting stream from collection
        Stream<String> stream = items.stream();

        //getting stream, applying filter and the collecting object in list
        List<String> filtered = items.stream()
                .filter(item -> item.startsWith("o"))
                .collect(Collectors.toList());

        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

        //example
        myList
                .stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

        //stream() and parallelStream()

        Arrays.asList("a1", "a2", "a3")
                .stream()
                .findFirst()
                .ifPresent(System.out::println); //a1

        //Stream.of() to create stream without collection

        Stream.of("a1", "a2", "a3")
                .findFirst()
                .ifPresent(System.out::println);

        //IntStream,LongStream,DoubleStream
        IntStream.range(1, 5)
                .forEach(System.out::println);

        Arrays.stream(new int[]{1, 2, 3, 5})
                .map(n -> (2 * n + 1))
                .average()
                .ifPresent(System.out::println);

        //Converting object stream to primitive stream
        Stream.of("a1","a2","a3")
                .map(s -> s.substring(1))
                .mapToInt(Integer::parseInt)
                .max()
                .ifPresent(System.out::println);




    }
}
