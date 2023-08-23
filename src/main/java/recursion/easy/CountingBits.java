package recursion.easy;

public class CountingBits {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(countBits(n));
    }

    private static int countBits(int n) {
        if (n == 0) return 0;
//        if ((n & 1) == 1) {
//            return 1 + countBits(n >> 1);
//        } else {
//            return 0 + countBits(n >> 1);
//        }
        return (n & 1) + countBits(n >> 1);
    }

}
