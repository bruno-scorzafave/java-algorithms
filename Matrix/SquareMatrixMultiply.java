package Matrix;

public class SquareMatrixMultiply {
    public static int[][] squareMatrixMultiply(int[][] matrix1, int[][] matrix2, int[][]matrix3, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    matrix3[i][j] = matrix3[i][j] + matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return matrix3;
    }
}
