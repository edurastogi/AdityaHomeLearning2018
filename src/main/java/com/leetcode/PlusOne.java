package com.leetcode;

public class PlusOne {
    public static void main(String[] args) {
        int[] firstArray = {7,9,9,9,9};
        int[] plusOne =  new int[firstArray.length +1];
        int carry =0;
        int p1 = firstArray.length -1 ;
        int temp = firstArray[p1] + 1 ;





        for (int i = firstArray.length -1; i >=0 ; i--) {
            System.out.println(firstArray[i]);
        }





        /*int[] inputArray = {2,3,7,4,5};
        System.out.println(Arrays.toString(inputArray));
        reverseIntArray(inputArray);
        System.out.println(Arrays.toString(inputArray));*/
    }

    public static void reverseIntArray(int[] inputArray){
        if(inputArray==null || inputArray.length <=1) return;
        for(int i = 0; i < inputArray.length / 2; i++)
        {
            int temp = inputArray[i];
            inputArray[i] = inputArray[inputArray.length - i - 1];
            inputArray[inputArray.length - i - 1] = temp;
        }
    }
}
