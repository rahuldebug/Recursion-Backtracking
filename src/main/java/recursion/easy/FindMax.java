package recursion.easy;

public class FindMax {
    public static void main(String[] args) {
        int[] a = {1, 2, 31, 4, 5};
        int n = a.length;
        System.out.println(max(a, n));
    }

    private static int max(int[] a, int n) {
        if (n == 0) return a[0];
        return Math.max(a[n - 1], max(a, n - 1));
    }
}
