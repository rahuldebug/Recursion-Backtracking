package recursion.easy;

public class Factorial {
    int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        int result = factorial.factorial(5);
        System.out.println(result);
    }
}
