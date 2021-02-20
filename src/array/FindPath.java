package array;

import java.util.ArrayList;
import java.util.List;

public class FindPath {
    public static void main(String[] args) {
        int[][] board = {{0,0,0,1,1},
                         {0,1,0,1,1},
                         {1,1,0,1,1},
                         {1,1,1,1,1},
                         {1,1,1,1,1}};
        boolean result = findPath(board);
        if(!result) System.out.println("无路径");
    }
    private static boolean findPath(int[][] board) {
        int len=0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j]==1) len+=2;
            }
        }
        List<Integer> list = new ArrayList<>();
        boolean result=false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                result = result||dfs(board,i,j,list,len);
            }
        }
        return result;
    }

    private static boolean dfs(int[][] board,int i,int j,List<Integer> list,int len) {//从[i][j]位置开始走
        if(i<0||j<0||i > board.length - 1 || j > board[0].length - 1) return false;//超出范围
        if(board[i][j]==0) return false;
        //System.out.println(i+","+j);
        board[i][j] = 0;//进行访问
        list.add(i);
        list.add(j);
        if(list.size()==len) {//符合条件
            for (int k = 0; k < list.size()-1; k=k+2) {
                System.out.print("["+list.get(k)+","+list.get(k+1)+"]-->");
            }
            return true;
        }else if(list.size()>len){
            System.out.println("不可连接");
            return false;
        }
        //走四个方向
        if(dfs(board,i+1,j,list,len)||
                dfs(board,i,j+1,list,len)||
                dfs(board,i-1,j,list,len)||
                dfs(board,i,j-1,list,len)) return true;
        else {//回溯
            board[i][j]=1;
            list.remove(list.size()-1);
            list.remove(list.size()-1);
            return false;
        }
    }
}
