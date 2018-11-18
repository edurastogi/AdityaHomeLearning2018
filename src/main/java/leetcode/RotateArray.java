package leetcode;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotateArray(array, k);
        System.out.println(Arrays.toString(array));



        /*int rotateBy = 3;
        int place =0;
        int temp;
        System.out.println(Arrays.toString(array));
        for (int i = 1; i <=(array.length/2 +1) ; i++) {
            place = (i +(rotateBy - 1))%(array.length);
            System.out.println("array[(i-1)] :" + array[(i-1)]+ " array[place]: " + array[place]);
            temp = array[(i-1)];
            array[(i-1)] = array[place];
            array[place] = temp;
            System.out.println("array[(i-1)] :" + array[(i-1)]+ " array[place]: " + array[place]);
            System.out.println("**********************");
            System.out.println(Arrays.toString(array));
        }
        System.out.println(Arrays.toString(array));*/
    }

    public static void rotateArray(int[] nums, int k) {
        int previous;
        int temp;
        for (int j = 0; j < k; j++) {
            previous = nums[nums.length -1];
            for (int i = 0; i < nums.length; i++) {
                    temp = nums[i];
                    nums[i] = previous;
                    previous = temp;
            }
        }
    }
}
