package recursion;

public class itterateArray {
    public static void main(String[] args) {
        int A[] = {1, 2, 3, 4, 5};
        System.out.println(recursiveIteration(A, A.length - 1));
    }

    public static float recursiveIteration(int[] a, int length) {
        float sum = 0;
        while (length>-1){
            sum= recursiveIteration(a, length - 1) + a[length];
        }
//        if (length < 0) return 0;
//        System.out.println(a[length]);
//
//        sum= recursiveIteration(a, length - 1) + a[length];
        return sum/length+1;
    }
}
