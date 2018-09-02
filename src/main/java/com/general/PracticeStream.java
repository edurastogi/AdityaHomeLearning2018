package com.general;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PracticeStream {
    public static void main(String[] args) {
        //Map - Filter - Reduce

        //firstPredicate();

        //intermediaryAndFinal();

        //flatMapExample();

        reductionExample();

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
       /* Stream<String> stream = Stream.of("one","two","three","four","five");
        Predicate<String> p1 = Predicate.isEqual("two");
        Predicate<String> p2 = Predicate.isEqual("three");
        List<String> list = new ArrayList<>();*/

        //nothing will execute in this step
        /*stream.peek(x -> System.out.println(x))
                .filter(p1.or(p2))
                .peek(y ->list.add(y));*/

        //this will execute both peek and forEach
    /*    stream.peek(x -> System.out.println(x))
                .filter(p1.or(p2))
                .forEach(y ->list.add(y));

        System.out.println("Done!");
        System.out.println("size = " + list.size());*/
    }

    public static void firstPredicate() {

        List<String> strings = Arrays.asList("one", "two", "three", "four", "five");
        //Stream<String> stream = Stream.of("one","two","three","four","five");

        Predicate<String> p1 = s -> s.length() > 3;

        strings.stream().filter(p1).forEach(s -> System.out.println(s));

        Predicate<String> p2 = Predicate.isEqual("two");
        Predicate<String> p3 = Predicate.isEqual("three");

        strings.stream().filter(p2.or(p3)).forEach(s -> System.out.println(s));
    }

    public static void intermediaryAndFinal() {
        List<String> strings = Arrays.asList("one", "two", "three", "four", "five");
        //Stream<String> stream = Stream.of("one", "two", "three", "four", "five");
        Predicate<String> p1 = Predicate.isEqual("two");
        Predicate<String> p2 = Predicate.isEqual("three");
        List<String> list = new ArrayList<>();

        strings.stream()
                .peek(s -> System.out.println(s))
                .filter(p1.or(p2))
                .peek(s -> list.add(s));

        System.out.println("size = " + list.size());

        strings.stream()
                .peek(s -> System.out.println(s))
                .filter(p1.or(p2))
                .forEach(s -> list.add(s));

        System.out.println("size = " + list.size());
    }

    public static void flatMapExample(){
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7);
        List<Integer> list2 = Arrays.asList(2,4,6);
        List<Integer> list3 = Arrays.asList(3,5,7);

        List<List<Integer>> listOfList = Arrays.asList(list1,list2,list3);
        System.out.println(listOfList);

        listOfList.stream()
                .map(l ->l.size())
                .forEach(s -> System.out.println(s));
        System.out.println("1 :***************");

        Function<List<?>, Integer> size = List::size;

        listOfList.stream()
                .map(size)
                .forEach(s -> System.out.println(s));
        System.out.println("2 :***************");

        Function<List<Integer>, Stream<Integer>> flatmapper = l ->l.stream();

        listOfList.stream()
                .map(flatmapper)
                .forEach(s -> System.out.println(s));

        System.out.println("3 :***************");

        listOfList.stream()
                .flatMap(flatmapper)
                .forEach(s -> System.out.println(s));
    }

    public static void reductionExample(){
        List<Integer> list = Arrays.asList(-10);
        System.out.println("List :" + list);
        Integer listSum = list.stream()
                .reduce(0,Integer::sum);
                //.reduce(0,(i1,i2) -> i1+i2);
        System.out.println("listSum = " + listSum);

        // Identity element is not valid for min, max operation, it gives wrong results
        Integer listMax = list.stream()
                .reduce(0,Integer::max);
        System.out.println("listMax = " + listMax);

        // use of optional
        Optional<Integer> listMaxOption = list.stream()
                .reduce(Integer::max);
        if(listMaxOption.isPresent()){
            System.out.println("listMax = " + listMaxOption.get());
        }else{
            System.out.println("Max is undefined");
        }

    }
}
