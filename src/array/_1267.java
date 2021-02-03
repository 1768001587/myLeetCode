package array;

public class _1267 {
    public static void main(String[] args) {
        int[][] grid = {{1,1,0,0},{0,0,1,0},{0,0,1,0},{0,0,0,1}};
        System.out.println(countServers(grid));
    }
    public static int countServers(int[][] grid) {
        int result = 0;
        //计算每一行
        int eachCount = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j]==1) eachCount++;
            }
            if(eachCount>1) {
                result+=eachCount;
                for (int j = 0; j < grid[i].length; j++) {
                    if(grid[i][j]==1) grid[i][j]=-1;//表示已经标记过
                }
            }
            eachCount = 0;//重置为0
        }
//        for (int i = 0; i < grid.length; i++) {
//            for (int j = 0; j < grid[i].length; j++) {
//                System.out.print(grid[i][j]+" ");
//            }
//            System.out.println();
//        }
        //计算每一列
        for (int i = 0; i < grid[0].length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if(grid[j][i]==1||grid[j][i]==-1) eachCount++;
            }
//            System.out.println(eachCount);
            if(eachCount>1) {
                for (int j = 0; j < grid.length; j++) {
                    if(grid[j][i]==1) result++;
                }
            }
            eachCount = 0;//重置为0
        }
        return result;
    }
}
