package Polynomial.HonersRule;

public class HonersRule {
    public static int honersRule(int[] arr, int length, int x) {
        int p  = 0;
        for (int i = length - 1; i >= 0; i--) {
            p = arr[i] + p * x;
        }
        return p;
    }
}
