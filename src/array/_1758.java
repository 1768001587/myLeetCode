package array;

public class _1758 {
    public static void main(String[] args) {
        System.out.println(minOperations("0100"));
    }
    public static int minOperations(String s) {
        int a = 0;int b = 0;
        int c1 = 0;int c2 = 1;
        for (int i = 0; i < s.length();i++) {
            int c = s.charAt(i)-'0';
            if (c!=c1) {//01010101...
                a++;
            }
            c1 = 1-c1;
            if (c!=c2) {//10101010...
                b++;
            }
            c2 = 1-c2;
        }
        System.out.println(a+","+b);
        return Math.min(a,b);
    }
}
