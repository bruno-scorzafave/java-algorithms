import java.util.Arrays;

import InsertionSort.InsertionSort;
import SelectionSort.SelectionSort;
import MergeSort.MergeSort;
import Search.BinarySearch.BinarySearch;
import Heap.HeapSort;
import Heap.MaxHeap;
import Heap.MinHeap;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[] { 4, 1, 3, 2, 16, 9, 10, 14, 8, 7 };
        System.out.println("Initial array: " + Arrays.toString(arr));

        MaxHeap maxHeap = new MaxHeap(arr.length, arr);
        maxHeap.buildMaxHeap();

        System.out.println("Max Heap : " + Arrays.toString(arr));

        HeapSort heapSort = new HeapSort();
        heapSort.heapSort(maxHeap);

        System.out.println("Max Heap Sorted : " + Arrays.toString(arr));

        MinHeap minHeap = new MinHeap(arr.length, arr);
        minHeap.buildMinHeap();

        System.out.println("Min Heap : " + Arrays.toString(arr));

        heapSort.heapSort(minHeap);

        System.out.println("Min Heap Sorted : " + Arrays.toString(arr));
    }
}