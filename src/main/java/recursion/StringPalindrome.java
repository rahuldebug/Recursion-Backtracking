package recursion;

public class StringPalindrome {
    public boolean palindrome(String s, int first, int last) {

        if (first == last) return true;
        if (s.charAt(first) != s.charAt(last)) return false;
        if (first < last + 1) {
            palindrome(s, first++, last--);
        }
        return true;
    }

    public static void main(String[] args) {
        StringPalindrome stringPalindrome = new StringPalindrome();
        String s = new String("aabaa");
        System.out.println(stringPalindrome.palindrome(s, 0, s.length() - 1));
    }
}
