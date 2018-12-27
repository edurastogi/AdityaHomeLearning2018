package learnprogramming;

import java.util.Arrays;

public class ShellSort {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        System.out.println(Arrays.toString(intArray));

        for (int gap = intArray.length / 2; gap > 0; gap = gap / 2) {

            for (int i = gap; i < intArray.length; i++) {

                int newElement = intArray[i];

                int j = i;

                while (j >= gap && intArray[j - gap] > newElement) {

                    intArray[j] = intArray[j - gap];

                    j = j - gap;
                }

                intArray[j] = newElement;
            }
        }


        System.out.println(Arrays.toString(intArray));
    }


}
