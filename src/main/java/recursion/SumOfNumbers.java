package recursion;

public class SumOfNumbers {
    public static void main(String[] args) {
        //int n=5;
        System.out.println(sum(100));
    }

    public static int sum(int i) {
        if(i==0) return 0;
        return sum(i-1)+i;
    }
}
