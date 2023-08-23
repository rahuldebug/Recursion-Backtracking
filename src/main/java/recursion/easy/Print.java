package recursion.easy;

public class Print {
    public void printReverse(int n){
        if(n==0) return;
        System.out.println(n);
        printReverse(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Print print= new Print();
        print.printReverse(5);
    }
}
