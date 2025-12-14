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

    public static int[][] squareMatrixMultiplyRecursive(int[][] matrix1, int[][] matrix2, int[][]matrix3, int size) {
        if (size == 1) {
            matrix3[0][0] += matrix1[0][0] * matrix2[0][0];
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

        squareMatrixMultiplyRecursive(A11, B11, C11, newSize);
        squareMatrixMultiplyRecursive(A12, B21, C11, newSize);
        squareMatrixMultiplyRecursive(A11, B12, C12, newSize);
        squareMatrixMultiplyRecursive(A12, B22, C12, newSize);
        squareMatrixMultiplyRecursive(A21, B11, C21, newSize);
        squareMatrixMultiplyRecursive(A22, B21, C21, newSize);
        squareMatrixMultiplyRecursive(A21, B12, C22, newSize);
        squareMatrixMultiplyRecursive(A22, B22, C22, newSize);

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

    public static int[][] squareMatrixMultiplyRecursiveGeneralized(int[][] matrix1, int[][] matrix2, int originalSize) {
        int newSize = nextPowerOfTwo(originalSize);

        int[][] paddedMatrix1 = new int[newSize][newSize];
        int[][] paddedMatrix2 = new int[newSize][newSize];
        int[][] paddedMatrix3 = new int[newSize][newSize];

        for (int i = 0; i < originalSize; i++) {
            for (int j = 0; j < originalSize; j++) {
                paddedMatrix1[i][j] = matrix1[i][j];
                paddedMatrix2[i][j] = matrix2[i][j];
            }
        }

        squareMatrixMultiplyRecursive(paddedMatrix1, paddedMatrix2, paddedMatrix3, newSize);

        int[][] finalResult = new int[originalSize][originalSize];
        for (int i = 0; i < originalSize; i++) {
            for (int j = 0; j < originalSize; j++) {
                finalResult[i][j] = paddedMatrix3[i][j];
            }
        }

        return finalResult;
    }

    private static int nextPowerOfTwo(int n) {
        int count = 0;

        if (n > 0 && (n & (n - 1)) == 0) return n;

        while(n != 0) {
            n >>= 1;
            count += 1;
        }
        
        return 1 << count;
    }
}
