package com.general;

public class ComparatorLambda {
    public static void main(String[] args) {


        /*Comparator<String> compLambda = (String s1, String s2) -> Integer.compare(s1.length(), s2.length());
        List<String> list = Arrays.asList("***", "**", "*****", "*");
        Collections.sort(list, compLambda);

        for (String s : list) {
            System.out.println(s);
        }*/

        /*List<String> myList = new ArrayList<>(Arrays.asList("adi","navya","pallavi"));
        myList.forEach(s -> System.out.println(s));
        myList.forEach(System.out::println);*/

        /*Predicate<String> p1 = s -> s.length() < 20;
        Predicate<String> p2 = s -> s.length()  > 20;
        Predicate<String> p3 = p1.and(p2);*/

        /*
        List<String> strings = Arrays.asList("one","two","three","four","five");
        List<String> result = new ArrayList<>();

        Consumer<String> c1 = s-> System.out.println(s);
        Consumer<String> c2 = s-> result.add(s);

        strings.forEach(c1.andThen(c2));
        System.out.println("size of result = " + result.size());
        */
    }
}
