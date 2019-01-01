package learnprogramming;

import java.util.Arrays;

public class SortingArrayUsingJdk  {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        Arrays.sort(intArray);

        Arrays.parallelSort(intArray);

        System.out.println(Arrays.toString(intArray));

        //for sorting object implement comperable method
        System.out.println("Min length of array for Parallel sort : "+ (1 << 13));

    }
}
