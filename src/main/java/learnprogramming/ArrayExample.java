package learnprogramming;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {

        int[] intArray = new int[7];
        //array are not dynamic data structure
        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;

        System.out.println(Arrays.toString(intArray));

        int index = -1;
        for (int i = 0; i < intArray.length; i++) {
            if(intArray[i]==7){
                index =i;
                break;
            }
        }
        System.out.println("index = " + index);
    }
}
