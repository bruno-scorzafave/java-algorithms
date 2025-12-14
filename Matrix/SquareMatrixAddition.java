package Matrix;

public class SquareMatrixAddition {
    public static int[][] squareMatrixAdditionRecursive(int[][] matrix1, int[][] matrix2, int[][] matrix3, int size) {
        if (size == 1) {
            matrix3[0][0] += matrix1[0][0] + matrix2[0][0];
            return matrix3;
        }

        int newSize = size / 2;
        int[][] A11 = new int[newSize][newSize];
        int[][] A12 = new int[newSize][newSize];
        int[][] A21 = new int[newSize][newSize];
        int[][] A22 = new int[newSize][newSize];
        int[][] B11 = new int[newSize][newSize];
        int[][] B12 = new int[newSize][newSize];
        int[][] B21 = new int[newSize][newSize];
        int[][] B22 = new int[newSize][newSize];
        int[][] C11 = new int[newSize][newSize];
        int[][] C12 = new int[newSize][newSize];
        int[][] C21 = new int[newSize][newSize];
        int[][] C22 = new int[newSize][newSize];

        for (int i = 0; i < newSize; i++) {
            for (int j = 0; j < newSize; j++) {
                A11[i][j] = matrix1[i][j];
                A12[i][j] = matrix1[i][j + newSize];
                A21[i][j] = matrix1[i + newSize][j];
                A22[i][j] = matrix1[i + newSize][j + newSize];

                B11[i][j] = matrix2[i][j];
                B12[i][j] = matrix2[i][j + newSize];
                B21[i][j] = matrix2[i + newSize][j];
                B22[i][j] = matrix2[i + newSize][j + newSize];
            }
        }

        squareMatrixAdditionRecursive(A11, B11, C11, newSize);
        squareMatrixAdditionRecursive(A12, B12, C12, newSize);
        squareMatrixAdditionRecursive(A21, B21, C21, newSize);
        squareMatrixAdditionRecursive(A22, B22, C22, newSize);

        for (int i = 0; i < newSize; i++) {
            for (int j = 0; j < newSize; j++) {
                matrix3[i][j] += C11[i][j];
                matrix3[i][j + newSize] += C12[i][j];
                matrix3[i + newSize][j] += C21[i][j];
                matrix3[i + newSize][j + newSize] += C22[i][j];
            }
        }
        
        return matrix3;
    }
}
