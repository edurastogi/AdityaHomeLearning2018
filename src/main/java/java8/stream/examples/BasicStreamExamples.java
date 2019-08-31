package java8.stream.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
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
                .filter(item ->item.startsWith("o"))
                .collect(Collectors.toList());
    }
}
