package cracking;

import java.util.Arrays;

public class RotateMatrix17 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.deepToString(matrix));
        rotateMatrixInPlace(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

    private static void rotateMatrixInPlace(int[][] matrix) {
        int length = matrix.length - 1;

        for (int i = 0; i < length / 2; i++) {
            for (int j = i; j < length - i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[length - j][i];
                matrix[length - j][i] = matrix[length - i][length - j];
                matrix[length - i][length - j] = matrix[j][length - i];
                matrix[j][length - i] = temp;
            }
        }
    }
}
