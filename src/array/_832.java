package array;

public class _832 {
    public static void main(String[] args) {
        int[][] A = {{1,1,0},{1,0,1},{0,0,0}};
        A = flipAndInvertImage(A);
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] flipAndInvertImage(int[][] A) {
        int tmp;
        for (int i = 0; i < A.length; i++) {
            int len = A[i].length;
            if(len%2!=0){
                A[i][len/2] = 1-A[i][len/2];
            }
            for (int j = 0; j < len/2; j++) {
                tmp = A[i][j];
                A[i][j] = 1-A[i][len-1-j];
                A[i][len-1-j] = 1-tmp;
            }
        }
        return A;
    }
}
