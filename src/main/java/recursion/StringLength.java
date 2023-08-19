package recursion;

public class StringLength {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(findLength(str));
    }

    public static int findLength(String str) {
        if (str.equals("")) return 0;
        return findLength(str.substring(1))+1;

    }
}
