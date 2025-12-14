package Matrix;

public class SquareMatrixAddition {
    public static void squareMatrixAdditionRecursive(int[][] matrix1, int[][] matrix2, int[][] matrix3, int row, int column, int size) {
        if (size == 1) {
            matrix3[row][column] += matrix1[row][column] + matrix2[row][column];
            return;
        }

        int newSize = size / 2;

        squareMatrixAdditionRecursive(matrix1, matrix2, matrix3, row, column, newSize);
        squareMatrixAdditionRecursive(matrix1, matrix2, matrix3, row, column + newSize, newSize);
        squareMatrixAdditionRecursive(matrix1, matrix2, matrix3, row + newSize, column, newSize);
        squareMatrixAdditionRecursive(matrix1, matrix2, matrix3, row + newSize, column + newSize, newSize);
    }
}
