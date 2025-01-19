package MergeSort;

public class MergeSort {
    public static void sort(int [] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int center = (start + end)/2;

        sort(arr, start, center);
        sort(arr, center+1, end);

        merge(arr, start, center, end);
    }

    static void merge(int[] arr, int start, int center, int end) {
        int leftRange = center - start + 1;
        int rightRange = end - center;
        int[] leftArray = new int[leftRange];
        int[] rightArray = new int[rightRange];

        for (int i = 0; i < leftRange; i++) {
            leftArray[i] = arr[start + i];
        }

        for (int j = 0; j < rightArray.length; j++) {
            rightArray[j] = arr[center + j + 1];
        }

        int smallestLeft = 0;
        int smallestRight = 0;
        int indexToMerge = start;

        while (smallestLeft < leftRange && smallestRight < rightRange) {
            if (leftArray[smallestLeft] < rightArray[smallestRight]) {
                arr[indexToMerge] = leftArray[smallestLeft];
                smallestLeft++;
            } else {
                arr[indexToMerge] = rightArray[smallestRight];
                smallestRight++;
            }
            indexToMerge++;
        }

        while (smallestLeft < leftRange) {
            arr[indexToMerge] = leftArray[smallestLeft];
            smallestLeft++;
            indexToMerge++;
        }

        while (smallestRight < rightRange) {
            arr[indexToMerge] = rightArray[smallestRight];
            smallestRight++;
            indexToMerge++;
        }

    }
}
