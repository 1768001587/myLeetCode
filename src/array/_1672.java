package array;

public class _1672 {
    public static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            max = sum>=max?sum:max;
            sum=0;
        }
        return max;
    }
}
