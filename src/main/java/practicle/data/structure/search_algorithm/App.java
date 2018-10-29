package practicle.data.structure.search_algorithm;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int x = 0;
        System.out.println(Arrays.toString(a));

        System.out.println("Linear Search : Index of element " + x + " : " + linearSearch(a, x));
        System.out.println("Binary Search : Index of element " + x + " : " + binarySearch(a, x));

    }

    public static int linearSearch(int[] a, int x) {
        int index = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static int binarySearch(int[] a, int x) {
        int p = 0;
        int r = a.length - 1;
        while (p <= r) {
            int q = Math.floorDiv((p + r), 2);
            if (a[q] == x) return q;
            else if (a[q] > x) r = q - 1;
            else p = q + 1;
        }
        return -1;
    }
}
