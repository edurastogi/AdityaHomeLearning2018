package HackerRank;

public class BirthdayCakeCandles {
    public static void main(String[] args) {
        int[] ar = {2, 1, 3, 3, 3};
        int max = 0;
        for (int i = 0; i < ar.length; i++) {
            if (max < ar[i]) max = ar[i];
        }
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == max) count = count + 1;
        }
        System.out.println(count);



        /*Arrays.sort(ar);
        int counter = 1;
        int arrayIndex = ar.length -1;
        int max = ar[arrayIndex];

        while(arrayIndex > 1){
            if(ar[--arrayIndex] == max) counter = counter + 1;
            else break;
        }*/
        //System.out.println(counter  W[[[);


    }
}
