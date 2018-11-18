package HackerRank;

public class Kangaroo {
    public static void main(String[] args) {
        int x1 = 47;
        int v1 = 2;
        int x2 = 70;
        int v2 = 2;

        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);

    }

    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {
        String answer = "NO";
        int d = 0;
        int div = -1;
        if (v2 - v1 != 0) {
            d = (x1 - x2) % (v2 - v1);
            div = (x1 - x2) / (v2 - v1);
        }

        if (div > 0 && d == 0) answer = "YES";
        return answer;
    }

}
