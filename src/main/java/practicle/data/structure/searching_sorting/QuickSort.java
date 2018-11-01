package practicle.data.structure.searching_sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] inputArray = {12, 81, 74, 43, 1098, 0, 8, 92, 17, 754, 912, 0, 6, 4};
        System.out.println("Unsorted Array : " + Arrays.toString(inputArray));
        quickSort(inputArray, 0, inputArray.length - 1);
        System.out.println("Sorted Array : " + Arrays.toString(inputArray));
    }

    private static void quickSort(int[] inputArray, int start, int end) {
        if (start < end) {
            int q = partition(inputArray, start, end);
            quickSort(inputArray, start, q - 1);
            quickSort(inputArray, q + 1, end);
        }
    }

    private static int partition(int[] inputArray, int start, int end) {
        int x = inputArray[end];
        int i = start - 1;
        for (int j = start; j < end; j++) {
            if (inputArray[j] <= x) {
                i = i + 1;
                swap(inputArray, i, j);
            }
        }
        swap(inputArray, i + 1, end);
        return i + 1;
    }

    private static void swap(int[] inputArray, int i, int j) {
        int tmp = inputArray[i];
        inputArray[i] = inputArray[j];
        inputArray[j] = tmp;
    }
}
