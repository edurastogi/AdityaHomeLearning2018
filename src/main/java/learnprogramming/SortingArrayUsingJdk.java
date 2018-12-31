package learnprogramming;

import java.util.Arrays;

public class SortingArrayUsingJdk {
    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));

    }
}
