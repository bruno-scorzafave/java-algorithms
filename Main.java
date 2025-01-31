import java.util.Arrays;

import InsertionSort.InsertionSort;
import SelectionSort.SelectionSort;
import MergeSort.MergeSort;
import Search.BinarySearch.BinarySearch;
import Heap.MaxHeap;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[] { 4, 1, 3, 2, 16, 9, 10, 14, 8, 7 };
        System.out.println("Initial array: " + Arrays.toString(arr));

        MaxHeap maxHeap = new MaxHeap(arr.length, arr);
        maxHeap.buildMaxHeap();;

        System.out.println("Max Heap : " + maxHeap.toString());
    }
}