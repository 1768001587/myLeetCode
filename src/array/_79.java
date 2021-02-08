package array;

public class _79 {
    public static void main(String[] args) {
        char[][] board = {{'A','B','C','E'},
                          {'S','F','C','S'},
                          {'A','D','E','E'}};
        System.out.println(exist(board,"SEE"));
    }
    public static boolean exist(char[][] board, String word) {
        int[][] visited = new int[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(dfs(board,visited,word,i,j,new StringBuilder())) return true;
            }
        }
        return false;
    }

    private static boolean dfs(char[][] board,int[][] visited, String word,int i,int j,StringBuilder str) {
        if(str.toString().equals(word)) {return true; }
        if(!word.startsWith(str.toString())) return false;
        if (i < 0 || j < 0 || i > board.length - 1 || j > board[0].length - 1) return false;
        if (visited[i][j] == 1) return false;
        str.append(board[i][j]);
        visited[i][j] = 1;
        if (dfs(board, visited, word, i + 1, j, str)) {
            return true;
        } else if (dfs(board, visited, word, i, j + 1, str)) {
            return true;
        } else if (dfs(board, visited, word, i - 1, j, str)) {
            return true;
        } else if (dfs(board, visited, word, i, j - 1, str)) {
            return true;
        } else {
            //回溯
            str.deleteCharAt(str.length() - 1);
            visited[i][j] = 0;
            return false;
        }
    }
}
