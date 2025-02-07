package Utils;

public class Utils {
    public static void swap(int[] arr, int firstNode, int secondNode) {
        int tmp = arr[firstNode];
        arr[firstNode] = arr[secondNode];
        arr[secondNode] = tmp;
    }
}
