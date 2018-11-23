package algo.problem.udemy;

public class HamiltonianPathTest {

    public static void main(String[] args) {

        int[][] matrix = {
                {0,1,0},
                {1,0,1},
                {1,1,0}
        };

        HamiltonianCycle cycle = new HamiltonianCycle(matrix);
        cycle.solve();
    }
}
