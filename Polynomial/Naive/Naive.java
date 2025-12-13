package Polynomial.Naive;

public class Naive {
    public static int naivePlynomialEvaluation(int[] arr, int x) {
        int polynomial = 0;

        for (int i = 0; i < arr.length; i++) {
            int m = 1;
            for (int j = 0; j < i; j++) {
                m = m * x;
            }
            polynomial = arr[i] * m + polynomial;
        }

        return polynomial;
    }
}
