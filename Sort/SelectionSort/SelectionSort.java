package SelectionSort;

import Utils.Utils;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            int menorIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[menorIndex]) {
                    menorIndex = j;
                }
            }

            Utils.swap(arr, i, menorIndex);
        }
    }
}
