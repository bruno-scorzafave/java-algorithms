package Matrix;

public class StrassenAlgorithm {
    public static void multiplyAndAdd(int[][] matrix1, int[][] matrix2, int[][] matrix3, int size) {
        int[][] product = strassenRecursive(matrix1, matrix2, size);

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix3[i][j] += product[i][j];
            }
        }
    }

    public static int[][] strassenRecursive(int[][] matrix1, int[][] matrix2, int size) {
        if (size == 1) {
            int [][] result = new int[1][1];
            result[0][0] = matrix1[0][0] * matrix2[0][0];
            return result;
        }

        int newSize = size / 2;
        int[][] A11 = split(matrix1, 0, 0, newSize);
        int[][] A12 = split(matrix1, 0, newSize, newSize);
        int[][] A21 = split(matrix1, newSize, 0, newSize);
        int[][] A22 = split(matrix1, newSize, newSize, newSize);
        int[][] B11 = split(matrix2, 0, 0, newSize);
        int[][] B12 = split(matrix2, 0, newSize, newSize);
        int[][] B21 = split(matrix2, newSize, 0, newSize);
        int[][] B22 = split(matrix2, newSize, newSize, newSize);

        int[][] S1 = sub(B12, B22);
        int[][] S2 = add(A11, A12);
        int[][] S3 = add(A21, A22);
        int[][] S4 = sub(B21, B11);
        int[][] S5 = add(A11, A22);
        int[][] S6 = add(B11, B22);
        int[][] S7 = sub(A12, A22);
        int[][] S8 = add(B21, B22);
        int[][] S9 = sub(A11, A21);
        int[][] S10 = add(B11, B12);

        int[][] P1 = strassenRecursive(A11, S1, newSize);
        int[][] P2 = strassenRecursive(S2, B22, newSize);
        int[][] P3 = strassenRecursive(S3, B11, newSize);
        int[][] P4 = strassenRecursive(A22, S4, newSize);
        int[][] P5 = strassenRecursive(S5, S6, newSize);
        int[][] P6 = strassenRecursive(S7, S8, newSize);
        int[][] P7 = strassenRecursive(S9, S10, newSize);

        int[][] C11 = add(sub(add(P5, P4), P2), P6);
        int[][] C12 = add(P1, P2);
        int[][] C21 = add(P3, P4);
        int[][] C22 = sub(sub(add(P5, P1), P3), P7);

        int[][] result = new int[size][size];
        join(C11, result, 0, 0, newSize);
        join(C12, result, 0, newSize, newSize);
        join(C21, result, newSize, 0, newSize);
        join(C22, result, newSize, newSize, newSize);

        return result;
    }

    public static int[][] split(int[][] parent, int row, int column, int size){
        int[][] child = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                child[i][j] = parent[i + row][j + column];
            }
        }

        return child;
    }
    public static void join(int[][] child, int[][] parent, int row, int column, int size){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                parent[i + row][j + column] = child[i][j];
            }
        }
    }

    public static int[][] add(int[][] matrix1, int[][]matrix2){
        int size = matrix1.length;
        int[][] sum = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return sum;
    }

    public static int[][] sub(int[][] matrix1, int[][]matrix2){
        int size = matrix1.length;
        int[][] sum = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sum[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        return sum;
    }
}
