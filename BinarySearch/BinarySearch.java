package BinarySearch;

public class BinarySearch {
    public static int recursiveBinarySearch(int[] sortedArray, int start, int end, int numberToFind) {
        if (end >= start) {
            int middlePoint = (start + end)/2;
            if (numberToFind == sortedArray[middlePoint]) {
                return middlePoint;
            } else if (numberToFind > sortedArray[middlePoint]) {
                return recursiveBinarySearch(sortedArray, middlePoint +  1, end, numberToFind);
            }
            return recursiveBinarySearch(sortedArray, start, middlePoint  - 1, numberToFind);
        }

        return -1;
    }

    public static int interativeBinarySearch(int[] sortedArray, int start, int end, int numberToFind) {
        while (start <= end) {
            int middlePoint = (start + end)/2;
            
            if (numberToFind == sortedArray[middlePoint]) {
                return middlePoint;
            } else if (numberToFind > sortedArray[middlePoint]) {
                start = middlePoint + 1;
            } else {
                end = middlePoint - 1;
            }

        }
        return -1;
    }
}
