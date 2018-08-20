package com.HackerRank;

public class Staircase {
    public static void main(String[] args) {
        int n = 5;
        StringBuilder printString = new StringBuilder();
        for(int i=0;i<n;i++){
            printString.append(" ");
        }
        System.out.println();
        for(int i=0;i<n;i++){
            printString.setCharAt((n-i-1), '#');
            //printString = printString + "#";
            System.out.println(printString.toString());
        }

        staircase(5);
    }
        static void staircase(int n) {
        for(int i = 1; i <= n; i++){ // rows

            int j = n;

            // loop to print (size - i) spaces
            while(j-- > i) {
                System.out.print(" ");
            }
            // loop to print (i) #s
            while(j-- >= 0) {
                System.out.print("#");
            }

            System.out.println();
        }
    }
}
