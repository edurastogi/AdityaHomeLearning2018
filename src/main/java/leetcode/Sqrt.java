package leetcode;

public class Sqrt {
    public static void main(String[] args) {
        Sqrt s = new Sqrt();
        System.out.println(s.mySqrt(8));

    }

    public int mySqrt(int x){
        int low = 1;
        int high = 2;
        while(1==1){
            if(x >= Math.pow(low,2) && x < Math.pow(high,2) ){
                break;
            }
            else{
                low++;
                high++;
            }
        }
        return low;
    }
}
