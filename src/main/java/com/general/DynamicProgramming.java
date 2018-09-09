package com.general;

import java.time.Duration;
import java.time.Instant;

public class DynamicProgramming {
    public static void main(String[] args) {
        //staircase problem
        int n = 50;
        Instant start = Instant.now();
        System.out.println(stairCaseSteps(n));
        Instant end = Instant.now();
        System.out.println("Time Taken :" + Duration.between(start,end).getNano());

        Instant start1 = Instant.now();
        System.out.println(stairCaseStepsArray(n));
        Instant end1 = Instant.now();
        System.out.println("Time Taken :" + Duration.between(start1,end1).getNano());

    }
    public static long stairCaseSteps(int n){
        if(n == 1) return 1;
        if(n == 2) return 2;
        return stairCaseSteps(n-1)+ stairCaseSteps(n-2);
    }
    public static long stairCaseStepsArray(int n){
        long[] steps = new long[n];
        steps[0] = 1;
        steps[1] = 2;
        for (int i = 2; i <steps.length ; i++) {
            steps[i] = steps[i-1] + steps[i-2];
        }
        return steps[n-1];
    }


}
