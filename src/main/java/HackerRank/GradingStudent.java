package HackerRank;

public class GradingStudent {
    public static void main(String[] args) {
        int[] grades = {73,67,38,33};
        int[] finalGradesArray =new int[grades.length];
        int roundedVal =0;
        for(int i=0;i<grades.length;i++){
            if(grades[i] < 38) finalGradesArray[i] = grades[i];
            else{
                roundedVal = grades[i]%5;
                if(roundedVal > 2) finalGradesArray[i] = grades[i] + (5-roundedVal);
                else finalGradesArray[i] = grades[i];
            }

        }
        for(int i=0;i<finalGradesArray.length;i++){
            System.out.println(finalGradesArray[i]);
        }
    }
}
