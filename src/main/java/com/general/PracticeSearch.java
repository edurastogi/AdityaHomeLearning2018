package com.general;

public class PracticeSearch {

    public static void main(String args[]) {
        /*
        int[] a = {10, 20, 80, 30, 60, 50,
                110, 100, 130, 170};
        int numberToFind = 110;

*/
        int arrayIndex = -1;
        int[] a = {10, 20, 80, 30, 60, 50,
                110, 100, 130, 170};
        int numberToFind = 175;

        for(int i =0;i<a.length;i++){
            if(numberToFind == a[i]){
                arrayIndex = i;
                break;
            }
        }
        if(arrayIndex != -1){
            System.out.println("Element x is present at index " + Integer.toString(arrayIndex));
        }else{
            System.out.println("Element x is not present in array");
        }


    }
}
