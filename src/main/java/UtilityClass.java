public class UtilityClass {

    public static void main(String args[]){
        UtilityClass utilityClass = new UtilityClass();
        int num = utilityClass.Sum(2,7);
        utilityClass.PrintSum(num);

    }

    public int Sum(int a, int b){
        return (a+b);
    }

    public void PrintSum(int sum){
        System.out.println("Hello World from Maven");
        System.out.println("Sum is : " + sum);
    }
}
