import java.util.Arrays;

import InsertionSort.InsertionSort;
import SelectionSort.SelectionSort;
import MergeSort.MergeSort;
import Search.BinarySearch.BinarySearch;
import Heap.MaxHeap;
import Heap.MinHeap;
import HeapSort.HeapSort;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[] { 4, 1, 3, 2, 16, 9, 10, 14, 8, 7 };
        System.out.println("Initial array: " + Arrays.toString(arr));

        InsertionSort.recursiveInsertionSort(arr, 0, arr.length - 1);
        System.out.println("Recursive insortion sorted array: " + Arrays.toString(arr));

        MaxHeap maxHeap = new MaxHeap(arr.length, arr);
        maxHeap.buildHeap();
        System.out.println("Max Heap : " + Arrays.toString(arr));

        HeapSort heapSort = new HeapSort();
        heapSort.heapSort(maxHeap);
        System.out.println("Max Heap Sorted : " + Arrays.toString(arr));

        MinHeap minHeap = new MinHeap(arr.length, arr);
        minHeap.buildHeap();
        System.out.println("Min Heap : " + Arrays.toString(arr));

        heapSort.heapSort(minHeap);
        System.out.println("Min Heap Sorted : " + Arrays.toString(arr));

        SelectionSort.selectionSort(arr);
        System.out.println("Selection Sorted Array: " + Arrays.toString(arr));
    }
}