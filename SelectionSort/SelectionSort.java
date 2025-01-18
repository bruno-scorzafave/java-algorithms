package SelectionSort;

public class SelectionSort {
    public static int[] selectionSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int menor = Integer.MAX_VALUE;
            int menorIndex = 0;

            for (int j = i; j < arr.length; j++) {
                if (arr[j] < menor) {
                    menor = arr[j];
                    menorIndex = j;
                }
            }

            arr[menorIndex] = arr[i];
            arr[i] = menor;
        }
        return arr;
    }
}
