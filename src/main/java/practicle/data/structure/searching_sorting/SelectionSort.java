package practicle.data.structure.searching_sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] myArray = {9,8,3,13,87,12,99};
        System.out.println("unsorted Array : " + Arrays.toString(myArray));
        int[] sortedArray = selectionSort(myArray);
        System.out.println("Sorted Array : " + Arrays.toString(sortedArray));
    }

    public static int[] selectionSort(int[] a){
        for (int i = 0; i <a.length ; i++) {
            int min = i;
            for (int j = i+1; j < a.length ; j++) {
                if(a[j] < a[min] ) min = j;
            }
            int tmp = a[i];
            a[i] = a[min];
            a[min] = tmp;
        }
        return  a;
    }
}
