package HackerRank;

public class PlusMinus {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 0, 0, -1, -2, -3, -4};
        int myArrayLen = arr.length;
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positiveCount++;
            } else if (arr[i] < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }
        System.out.println("positive Count :" + positiveCount);
        System.out.println("negative Count :" + negativeCount);
        System.out.println("zero Count :" + zeroCount);

        System.out.println((double)positiveCount/myArrayLen);
        System.out.println((double)negativeCount/myArrayLen);
        System.out.println((double)zeroCount/myArrayLen);
    }
}
