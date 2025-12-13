package Polynomial.HonersRule;

public class HonersRule {
    public static int honersRule(int[] arr, int x) {
        int polynomial  = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            polynomial = arr[i] + polynomial * x;
        }
        return polynomial;
    }
}
