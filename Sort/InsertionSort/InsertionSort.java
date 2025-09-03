package InsertionSort;

import Utils.Utils;

public class InsertionSort {
    public static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = key;
        }
    }

    public static void recursiveInsertionSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        recursiveInsertionSort(arr, 0, end - 1);

        int highestIndex = end - 1;
        int indexToCompare = end;

        while (arr[indexToCompare] < arr[highestIndex]) {
            Utils.swap(arr, indexToCompare, highestIndex);
            if (highestIndex == 0) {
                break;
            }
            highestIndex--;
            indexToCompare--;
        }
    }
}
