package recursion;

public class SumOfDigit {
    public static void main(String[] args) {
        System.out.println(findSum(123));
    }

    private static int findSum(int num) {
        if(num==0)return 0;
        return findSum(num/10)+num%10;
    }
}
