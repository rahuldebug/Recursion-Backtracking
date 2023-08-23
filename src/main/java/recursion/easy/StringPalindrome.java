package recursion.easy;

public class StringPalindrome {
    public boolean palindrome(String s, int first, int last) {

        if (first == last || last - first == 1) return true;
        if (s.charAt(first) != s.charAt(last)) return false;
        palindrome(s,first+1, last-1);
        return true;
    }

    public static void main(String[] args) {
        StringPalindrome stringPalindrome = new StringPalindrome();
        String s = new String("abc");
        System.out.println(stringPalindrome.palindrome(s, 0, s.length() - 1));
    }
}
