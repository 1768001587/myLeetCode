package array;

public class _867 {
    public static void main(String[] args) {
        int[][] A = {{1,2,3},{4,5,6},{7,8,9}};
        A = transpose(A);
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] transpose(int[][] A) {
        int tmp;
        int[][] result = new int[A[0].length][A.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                tmp = A[i][j];
                result[j][i] = tmp;
            }
        }
        return result;
    }
}
