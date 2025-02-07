package QuickSort;

import Utils.Utils;

public class QuickSort {
    public static void quickSort(int[] arr, int start, int end) {
        if (start > end) {
            return;
        }
        int dividingPoint = partition(arr, start, end);
        quickSort(arr, start, dividingPoint - 1);
        quickSort(arr, dividingPoint + 1, end);
    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int lowSideIndex = start - 1;
        
        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                lowSideIndex++;
                Utils.swap(arr, lowSideIndex, j);
            }
        }

        int newPivot = lowSideIndex + 1;
        Utils.swap(arr, newPivot, end);
        
        return newPivot;
    }
}
