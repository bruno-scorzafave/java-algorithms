package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Heap.HeapSort;
import Heap.MaxHeap;
import Heap.MinHeap;

import java.util.Arrays;

import InsertionSort.InsertionSort;
import Matrix.SquareMatrixMultiply;
import Search.LinearSearch.LinearSearch;

public class BasicTests {
    @Test
    public void insertionSort() {
        int[] arr = new int[] {3, 2, 1};
        InsertionSort.insertionSort(arr, arr.length);
        int[] expectedResult = new int [] {1, 2, 3};

        Assertions.assertEquals(Arrays.toString(expectedResult), Arrays.toString(arr));
    }

    @Test
    public void recursiveLinearSearch() {
        int[] arr = new int[] {1, 4, 2, 7};
        int numberToFind = 7;

        Assertions.assertEquals(3, LinearSearch.recursiveLinearSearch(arr, 0, arr.length, numberToFind));
    }

    @Test
    public void matrixMultiply() {
        int[][] matrix1 = { { 1, 5 }, { 2, 3 } };
        int[][] matriz2 = { { 1, 4 }, { 7, 9 } };
        int[][] matrixOfZeros = new int[2][2];


        int[][] expectedMatrix = { { 36, 49 }, { 23, 35 } };

        Assertions.assertEquals(Arrays.deepToString(expectedMatrix), Arrays.deepToString(SquareMatrixMultiply.squareMatrixMultiply(matrix1, matriz2, matrixOfZeros, 2)));
    }

    @Test
    public void maxHeap() {
        int[] arr = new int[] { 4, 1, 3, 2, 16, 9, 10, 14, 8, 7 };
        MaxHeap maxHeap = new MaxHeap(10, arr);
        maxHeap.buildHeap();

        int[] expectedArray = { 16, 14, 10, 8, 7, 9, 3, 2, 4, 1 };

        Assertions.assertEquals(Arrays.toString(expectedArray), Arrays.toString(maxHeap.heap));
    }

    @Test
    public void minHeap() {
        int[] arr = new int[] { 4, 1, 3, 2, 16, 9, 10, 14, 8, 7 };
        MinHeap minHeap = new MinHeap(10, arr);
        minHeap.buildHeap();

        int[] expectedArray = { 1, 2, 3, 4, 7, 9, 10, 14, 8, 16 };

        Assertions.assertEquals(Arrays.toString(expectedArray), Arrays.toString(minHeap.heap));
    }

    @Test
    public void maxHeapSort() {
        int[] arr = new int[] { 4, 1, 3, 2, 16, 9, 10, 14, 8, 7 };
        MaxHeap maxHeap = new MaxHeap(10, arr);
        maxHeap.buildHeap();

        HeapSort heapSort = new HeapSort();
        heapSort.heapSort(maxHeap);

        int[] expectedArray = { 1, 2, 3, 4, 7, 8, 9, 10, 14, 16 };

        Assertions.assertEquals(Arrays.toString(expectedArray), Arrays.toString(maxHeap.heap));
    }

    @Test
    public void minHeapSort() {
        int[] arr = new int[] { 4, 1, 3, 2, 16, 9, 10, 14, 8, 7 };
        MinHeap minHeap = new MinHeap(10, arr);
        minHeap.buildHeap();

        HeapSort heapSort = new HeapSort();
        heapSort.heapSort(minHeap);

        int[] expectedArray = { 16, 14, 10, 9, 8, 7, 4, 3, 2, 1 };

        Assertions.assertEquals(Arrays.toString(expectedArray), Arrays.toString(minHeap.heap));
    }
}
