package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

import InsertionSort.InsertionSort;

public class BasicTests {
    @Test
    public void insertionSort() {
        InsertionSort insertionSort = new InsertionSort();
        int[] sortedArray = insertionSort.insertionSort(new int[] {3, 2, 1}, 3);
        int[] expectedResult = new int [] {1, 2, 3};

        Assertions.assertEquals(Arrays.toString(expectedResult), Arrays.toString(sortedArray));

    }
}
