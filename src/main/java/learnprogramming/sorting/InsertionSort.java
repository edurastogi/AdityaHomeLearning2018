package learnprogramming.sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        System.out.println(Arrays.toString(intArray));

        insertionSortRecursion(intArray,1);

        System.out.println(Arrays.toString(intArray));
    }


    public static void insertionSort(int[] intArray){

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {

            int newElement = intArray[firstUnsortedIndex];
            int i;

            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {

                intArray[i] = intArray[i - 1];
            }

            intArray[i] = newElement;

        }
    }

    public static void insertionSortRecursion(int[] intArray, int numItems){

        if(numItems < 2) return;

        insertionSortRecursion(intArray, numItems -1);

        int newElement = intArray[numItems -1];
        int i;

        for (i = numItems -1; i > 0 && intArray[i - 1] > newElement; i--) {

            intArray[i] = intArray[i - 1];
        }

        intArray[i] = newElement;



    }

}
