package elements.of.programming;

import java.util.Arrays;

public class ArraysExamples {
    public static void main(String[] args) {

        int[] a = {3,4,7,8,11,12,13,14,15};
        System.out.println(Arrays.toString(a));
        evenOdd(a);
        System.out.println(Arrays.toString(a));

    }

    public static void evenOdd(int[] a) {
        int nextEven = 0;
        int nextOdd = a.length - 1;
        while (nextEven < nextOdd) {
            if (a[nextEven] % 2 == 0) {
                nextEven++;
            } else {
                int temp = a[nextEven];
                a[nextEven] = a[nextOdd];
                a[nextOdd--] = temp;
            }
        }
    }
}
