package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

import InsertionSort.InsertionSort;
import Search.LinearSearch.LinearSearch;

public class BasicTests {
    @Test
    public void insertionSort() {
        int[] arr = new int[] {3, 2, 1};
        InsertionSort.insertionSort(arr, arr.length);
        int[] expectedResult = new int [] {1, 2, 3};

        Assertions.assertEquals(Arrays.toString(expectedResult), Arrays.toString(arr));
    }

    @Test
    public void recursiveLinearSearch() {
        int[] arr = new int[] {1, 4, 2, 7};
        int numberToFind = 7;

        Assertions.assertEquals(3, LinearSearch.recursiveLinearSearch(arr, 0, arr.length, numberToFind));
    }
}
