package test;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Heap.HeapSort;
import Heap.MaxHeap;
import Heap.MinHeap;

public class HeapTests {
    public int[] arr = { 4, 1, 3, 2, 16, 9, 10, 14, 8, 7 };

    @Test
    public void maxHeap() {
        MaxHeap maxHeap = new MaxHeap(10, arr);

        int[] expectedArray = { 16, 14, 10, 8, 7, 9, 3, 2, 4, 1 };

        Assertions.assertEquals(Arrays.toString(expectedArray), Arrays.toString(maxHeap.heap));
    }

    @Test
    public void minHeap() {
        MinHeap minHeap = new MinHeap(10, arr);

        int[] expectedArray = { 1, 2, 3, 4, 7, 9, 10, 14, 8, 16 };

        Assertions.assertEquals(Arrays.toString(expectedArray), Arrays.toString(minHeap.heap));
    }

    @Test
    public void maxHeapSort() {
        MaxHeap maxHeap = new MaxHeap(10, arr);

        HeapSort heapSort = new HeapSort();
        heapSort.heapSort(maxHeap);

        int[] expectedArray = { 1, 2, 3, 4, 7, 8, 9, 10, 14, 16 };

        Assertions.assertEquals(Arrays.toString(expectedArray), Arrays.toString(maxHeap.heap));
    }

    @Test
    public void minHeapSort() {
        MinHeap minHeap = new MinHeap(10, arr);

        HeapSort heapSort = new HeapSort();
        heapSort.heapSort(minHeap);

        int[] expectedArray = { 16, 14, 10, 9, 8, 7, 4, 3, 2, 1 };

        Assertions.assertEquals(Arrays.toString(expectedArray), Arrays.toString(minHeap.heap));
    }

    @Test
    public void maxHeapExtractMax() {
        MaxHeap maxHeap = new MaxHeap(10, arr);
        maxHeap.maxHeapExtractMax();

        int[] expectedArray = { 14, 8, 10, 4, 7, 9, 3, 2, 1 };


        Assertions.assertEquals(Arrays.toString(expectedArray), Arrays.toString(maxHeap.heap));
    }

    @Test
    public void minHeapExtractMinimum() {
        MinHeap minHeap = new MinHeap(10, arr);
        minHeap.minHeapExtractMinimum();

        int[] expectedArray = { 2, 4, 3, 8, 7, 9, 10, 14, 16 };

        Assertions.assertEquals(Arrays.toString(expectedArray), Arrays.toString(minHeap.heap));
    }

    @Test
    public void maxHeapMaximum() {
        MaxHeap maxHeap = new MaxHeap(10, arr);
        int maximumValue = maxHeap.maxHeapMaximum();

        Assertions.assertEquals(16, maximumValue);
    }

    @Test
    public void minHeapMinimum() {
        MinHeap minHeap = new MinHeap(10, arr);
        int minimumValue = minHeap.minHeapMinimum();

        Assertions.assertEquals(1, minimumValue);
    }

    @Test
    public void maxHeapInsert() {
        MaxHeap maxHeap = new MaxHeap(10, arr);
        maxHeap.insert(15);

        int[] expectedArray = { 16, 15, 10, 8, 14, 9, 3, 2, 4, 1, 7 };

        Assertions.assertEquals(Arrays.toString(expectedArray), Arrays.toString(maxHeap.heap));
    }

    @Test
    public void minHeapInsert() {
        MinHeap minHeap = new MinHeap(10, arr);
        minHeap.insert(6);

        int[] expectedArray = { 1, 2, 3, 4, 6, 9, 10, 14, 8, 16, 7 };

        Assertions.assertEquals(Arrays.toString(expectedArray), Arrays.toString(minHeap.heap));
    }

}
