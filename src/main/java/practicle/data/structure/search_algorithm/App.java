package practicle.data.structure.search_algorithm;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int x = 4;

        System.out.println("Array is : " + Arrays.toString(a));
        System.out.println("Index of element : " + x);

        System.out.println("Linear Search : " + linearSearch(a, x));
        System.out.println("Linear Search Recursive : " + linerSearchRecursive(a, 0, x));
        System.out.println("Binary Search : " + binarySearch(a, x));
        System.out.println("Binary Search Recursive : " + binarySearchRecursive(a,0,a.length-1, x));

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

    public static int linerSearchRecursive(int[] a, int i, int x) {
        if (i > a.length - 1) return -1;
        else if (a[i] == x) return i;
        else return linerSearchRecursive(a, i + 1, x);
    }

    public static int binarySearch(int[] a, int x) {
        int p = 0;
        int r = a.length - 1;
        while (p <= r) {
            int q = Math.floorDiv((p + r), 2);
            if (x < a[q]) r = q - 1;
            else if (x > a[q]) p = q + 1;
            else return q;
        }
        return -1;
    }

    public static int binarySearchRecursive(int[] a, int p, int r, int x) {
        if (p > r) return -1;
        int q = Math.floorDiv((p + r), 2);
        if (a[q] > x) return binarySearchRecursive(a, p, q - 1, x);
        else if(a[q] < x) return binarySearchRecursive(a, q + 1, r, x);
        else return q;
    }
}
