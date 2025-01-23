package SelectionSort;

public class SelectionSort {
    public static int[] selectionSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            int menorIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[menorIndex]) {
                    menorIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[menorIndex];
            arr[menorIndex] = temp;
        }
        return arr;
    }
}
