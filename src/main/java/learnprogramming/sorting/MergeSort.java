package learnprogramming.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        System.out.println(Arrays.toString(intArray));

        mergeSort(intArray,0,intArray.length);

        System.out.println(Arrays.toString(intArray));
    }

    public static void mergeSort(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }
        //find the middle index
        int mid = (start + end) / 2;

        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }

    private static void merge(int[] input, int start, int mid, int end) {

        // if last element of left partition is smaller than first element of right partition
        // that means there is no need to merge, these partition are already merged
        if (input[mid - 1] <= input[mid]) {
            return;
        }
        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];

        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        //if we have element left in left array thn we need to copy them in temp array
        // if elements are left in right array then we don't need to do anything

        System.arraycopy(input,i,input,start+tempIndex,mid-i);
        System.arraycopy(temp,0,input,start,tempIndex);

    }


}
