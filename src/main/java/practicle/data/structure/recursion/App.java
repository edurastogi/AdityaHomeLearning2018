package practicle.data.structure.recursion;

public class App {
    public static void main(String[] args) {
        reduceByOne(10);
    }

    public static void reduceByOne(int n) {
        if (n >= 0) { //base case
            reduceByOne(n - 1);
        }
        System.out.println("Completed Call: " + n);
    }
}
