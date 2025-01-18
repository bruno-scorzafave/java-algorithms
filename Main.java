import java.util.Arrays;
import InsertionSort.InsertionSort;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[] {5, 2, 4, 8, 6, 1, 3, 7, 10, 9};

        int[] sortedArr = InsertionSort.insertionSort(arr, arr.length);

        System.out.println(Arrays.toString(sortedArr));
    }
}