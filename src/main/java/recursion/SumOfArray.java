package recursion;

public class SumOfArray {
    public static void main(String[] args) {
        int []a={1,2,3,4,5};
        System.out.println(sum(a,a.length-1));
    }

    public static int sum(int[] a, int length) {
        if(length<0) return 0;
        return sum(a,length-1)+a[length];
    }
}
