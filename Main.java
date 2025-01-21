import java.util.Arrays;

import InsertionSort.InsertionSort;
import SelectionSort.SelectionSort;
import MergeSort.MergeSort;
import BinarySearch.BinarySearch;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[] {5, 2, 4, 8, 6, 1, 3, 7, 10, 9};
        System.out.println("Initial array: " + Arrays.toString(arr));

        MergeSort.sort(arr, 0, arr.length - 1);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        int numberToFind = 4;
        int index = BinarySearch.interativeBinarySearch(arr, 0, arr.length - 1, numberToFind);
        System.out.println("Index of the number: " + numberToFind + " is " + index);

    }
}