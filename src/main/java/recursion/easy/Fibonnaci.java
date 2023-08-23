package recursion.easy;

public class Fibonnaci {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i < n; i++) {
            System.out.println(fib(i));
        }
    }

    private static long fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }
}
//memonisation will be taken later on