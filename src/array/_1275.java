package array;


public class _1275 {
    public static void main(String[] args) {
        int[][] moves = {{0,0},{2,0},{1,1},{2,1},{2,2}};
        System.out.println(tictactoe(moves));
    }
    public static String tictactoe(int[][] moves) {
        //检查最后一个下棋的人
        int len = moves.length;
        int[] arr = moves[len-1];
        int hangCounter = 0;
        int lieCounter = 0;
        int xieCounter = 0;//主对角线
        int fanXieCounter = 0;//副对角线
        int he = arr[0]+arr[1];
        int cha = arr[1] - arr[0];
        for (int i = len-1; i >=0 ; i = i-2) {
            int[] tmp = moves[i];
            //从后面往前查看
            if(tmp[0]==arr[0]) hangCounter++;//同一行
            if(tmp[1]==arr[1]) lieCounter++;//同一列
            if(tmp[0]+tmp[1] == he) xieCounter++;
            if(tmp[1] - tmp[0]==cha) fanXieCounter++;
        }
       // System.out.println(hangCounter+","+lieCounter+","+xieCounter+","+fanXieCounter);
        if(hangCounter==3||lieCounter==3||xieCounter==3||fanXieCounter==3){
            if(len%2==0) return "B";
            else return "A";
        }
        if(len==9) return "Draw";
        else return "Pending";
    }
}
