package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import InsertionSort.InsertionSort;
import Matrix.SquareMatrixMultiply;
import QuickSort.QuickSort;
import Search.LinearSearch.LinearSearch;

public class BasicTests {
    @Test
    public void insertionSort() {
        int[] arr = new int[] {3, 2, 1};
        InsertionSort.insertionSort(arr);
        int[] expectedResult = new int [] { 1, 2, 3 };

        Assertions.assertEquals(Arrays.toString(expectedResult), Arrays.toString(arr));
    }

    @Test
    public void recursiveLinearSearch() {
        int[] arr = new int[] { 1, 4, 2, 7 };
        int numberToFind = 7;

        Assertions.assertEquals(3, LinearSearch.recursiveLinearSearch(arr, 0, arr.length, numberToFind));
    }

    @Test
    public void matrixMultiply() {
        int[][] matrix1 = { { 1, 5 }, { 2, 3 } };
        int[][] matrix2 = { { 1, 4 }, { 7, 9 } };
        int[][] matrixOfZeros = new int[2][2];


        int[][] expectedMatrix = { { 36, 49 }, { 23, 35 } };

        Assertions.assertEquals(Arrays.deepToString(expectedMatrix), Arrays.deepToString(SquareMatrixMultiply.squareMatrixMultiply(matrix1, matrix2, matrixOfZeros, 2)));
    }

    @Test
    public void matrixMultiplyRecursive() {
        int[][] matrix1 = { { 1, 5 }, { 2, 3 } };
        int[][] matrix2 = { { 1, 4 }, { 7, 9 } };
        int[][] matrixOfZeros = new int[2][2];


        int[][] expectedMatrix = { { 36, 49 }, { 23, 35 } };

        Assertions.assertEquals(Arrays.deepToString(expectedMatrix), Arrays.deepToString(SquareMatrixMultiply.squareMatrixMultiplyRecursive(matrix1, matrix2, matrixOfZeros, 2)));
    }

    @Test
    public void squareMatrixMultiplyRecursiveGeneralized() {
        int[][] matrix1 = { { 1, 5, 3 }, { 2, 3, 6 }, { 7, 8, 4 } };
        int[][] matrix2 = { { 1, 4, 9 }, { 7, 9, 2 }, { 1, 8, 4 } };

        int[][] expectedMatrix = { { 39, 73, 31}, { 29, 83, 48}, { 67, 132, 95} };

        Assertions.assertEquals(Arrays.deepToString(expectedMatrix), Arrays.deepToString(SquareMatrixMultiply.squareMatrixMultiplyRecursiveGeneralized(matrix1, matrix2, 3)));
    }

    @Test
    public void quickSort() {
        int[] arr = new int[] { 1, 4, 2, 7 };
        QuickSort.quickSort(arr, 0, arr.length - 1);

        int[] expectedArray = new int[] { 1, 2, 4, 7 };

        Assertions.assertEquals(Arrays.toString(expectedArray), Arrays.toString(arr));
    }
}
