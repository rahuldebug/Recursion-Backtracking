package recursion.easy;

public class DecToBin {
    static StringBuilder sb= new StringBuilder();
    public static void main(String[] args) {
        //System.out.println(toBinary(1048576));
        System.out.println(toBinary(7));
    }

    public static String toBinary(int i) {
        if(i==0) return "";
        toBinary(i/2);
        sb.append(i%2);
        return sb.toString();
    }
}
