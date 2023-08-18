package recursion;

public class StringReverse {
    static StringBuilder sb= new StringBuilder();
    public static void main(String[] args) {
        String str="rahul";
        System.out.println(reverse(str,str.length()-1));
    }

    private static String reverse(String str,int len) {
        if(len<0)return "";
        sb.append(str.charAt(len));
        reverse(str,len-1);
        return sb.toString();
    }
}
