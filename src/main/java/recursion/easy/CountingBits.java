package recursion.easy;

public class CountingBits {
    public static void main(String[] args) {
        int n = 256;
        System.out.println(countBits(n));
    }

    private static int countBits(int n) {

        if (n == 0) return 0;
        //this logic will also work but the single line logic is better
//        if ((n & 1) == 1) {
//            return 1 + countBits(n >> 1);
//        } else {
//            return 0 + countBits(n >> 1);
//        }
        // >> shifts right by 1 for unsigned number , where as >>> shifts right by 1 irrespective of  signed or  unsigned bit
        return (n & 1) + countBits(n >>> 1);
    }

}
