package Search.LinearSearch;

public class LinearSearch {
    public int linearSearch(int[] arr, int start, int end, int numberToFind) {
        int numberIndex = -1;
        for (int i = start; i < end; i++) {
            if (arr[i] == numberToFind) {
                numberIndex = i;
            }
        }
        return numberIndex;
    }

    public static int recursiveLinearSearch(int[] arr, int start, int end, int numberToFind) {
        if (end < start) {
            return -1;
        }
        if (arr[end - 1] == numberToFind) {
            return end - 1;
        }
        return recursiveLinearSearch(arr, start, end - 1, numberToFind);
    }
}
