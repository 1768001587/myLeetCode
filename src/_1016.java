public class _1016 {
    public static void main(String[] args) {
        String s = "10010111100001110010";
        System.out.println(queryString(s,10));
    }
    public static boolean queryString(String S, int N) {
        StringBuilder str = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            int tmp = i;
            Integer.toBinaryString(i);
            //使用Integer.toBinaryString(i);可以直接将数字转换为二进制
            while(tmp!=0){
                int a = (tmp>>1)<<1;
                str.insert(0,tmp-a);
                tmp = tmp>>1;
            }
            if(!S.contains(str.toString())) return false;
           // System.out.println(str);
            str = new StringBuilder();
        }
        return true;
    }
}
