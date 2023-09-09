package recursion.easy;

class Solution {
    public static void main(String[] args) {
        String s = "race a car";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        if (s.length() == 0) return true;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i)))
                sb.append(s.charAt(i));
        }
        String ns = sb.toString().toLowerCase();
        System.out.println(ns);
        boolean flag = true;
        if (ns.length() % 2 == 0) flag = false;
        return palindrome(ns, 0, ns.length() - 1, flag);

    }

    public static boolean palindrome(String ns, int first, int last, boolean flag) {
        if (first == last || first>last) return true;
        System.out.println(ns.charAt(first) + "  " + first);
        System.out.println(ns.charAt(last) + "  " + last);
        if (ns.charAt(first) != ns.charAt(last)) return false;
        return  palindrome(ns, first + 1, last - 1, flag);


    }
}