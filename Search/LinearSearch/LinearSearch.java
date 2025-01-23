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
}
