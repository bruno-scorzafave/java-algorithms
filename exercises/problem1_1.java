package exercises;

public class problem1_1 {
    // value in microseconds
    public static long microsecond = 1;
    public static long second = (int) (microsecond * 1E6);
    public static long minute = second * 60;
    public static long hour = minute * 60;
    public static long day = 24 * hour;
    public static long month = 30 * day;
    public static long year = 12 * month;
    public static long century = 100 * year;

    public static int factorial(long limit) {
        long factorial = 1;
        int i = 0;
        while (true) {
            int nextN = i + 1;
            long nextFactorial = factorial * nextN;
            if (nextFactorial >= limit) {
                return i;
            }
            factorial = nextFactorial;
            i = nextN;
        }
    }

    public static int nlog2n (long limit) {
        int i = 0;
        while (true) {
            int nextN = i + 1;
            long nextNlog2n = (long) (nextN * Math.log(nextN)/ Math.log(2));
            if (nextNlog2n >= limit) {
                return i;
            }
            i = nextN;
        }
    }

    public static void main(String[] args) {
        System.out.println("Largest size n of a factorial that can be solved in 1 century: " + factorial(year));
        System.out.println("Largest size n of a n*log2(n) that can be solved in 1 second: " + nlog2n(second));
    }
}
