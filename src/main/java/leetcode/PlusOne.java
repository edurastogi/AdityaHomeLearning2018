package leetcode;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {

        PlusOne p = new PlusOne();
        int[] digits = {9,9,9,9};
        System.out.println(Arrays.toString(p.plusOne(digits)));

        /*
        three cases
        1) there is no carry : add one to last element of the array as as long as it is leas than 10 it is fine
        2) there is carry: adding one to last element makes sum equal or greater than 10, then we will put reminder
           in last place and add one in second last position, this will keep repeating until there is no carry
        3) we are reached at the begining of the last and after adding carry sum is greater than one, then we need to create
           a new array with one additonal size and then copy the arry

        int[] digits = {9,9,9,9};
        System.out.println(Arrays.toString(digits));
        int carry = 1;
        int temp;
        for (int i = digits.length-1; i >=0 ; i--) {
            if(carry ==0) break;
            temp = digits[i] + carry;
            if (temp >= 10) {
                digits[i] = temp % 10;
                carry = temp / 10;
            } else {
                digits[i] = temp;
                carry =0;
            }
        }
        if(carry !=0){
            int[] plusOne =  new int[digits.length +1];
            plusOne[0] = carry;
            for (int i = 0; i < digits.length ; i++) {
                plusOne[i+1] = digits[i];
            }
            digits = plusOne;
        }
        System.out.println(Arrays.toString(digits)); */
    }

    public int[] plusOne(int[] digits) {
        int carry = 1;
        int temp;
        for (int i = digits.length-1; i >=0 ; i--) {
            if(carry ==0) break;
            temp = digits[i] + carry;
            if (temp >= 10) {
                digits[i] = temp % 10;
                carry = temp / 10;
            } else {
                digits[i] = temp;
                carry =0;
            }
        }
        if(carry !=0){
            int[] plusOne =  new int[digits.length +1];
            plusOne[0] = carry;
            for (int i = 0; i < digits.length ; i++) {
                plusOne[i+1] = digits[i];
            }
            digits = plusOne;
        }
        return digits;

    }

}
