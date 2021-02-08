package array;

import java.util.Arrays;

public class _945 {
    public static void main(String[] args) {
        int[] arr = {3,2,1,2,1,7};
        System.out.println(minIncrementForUnique(arr));
    }
    public static int minIncrementForUnique(int[] A) {
        Arrays.sort(A);
        int result = 0;
        for (int i = 0; i < A.length-1; i++) {
            while(A[i+1]<=A[i]){
                A[i+1]++;
                result++;
            }
        }
        return result;
    }
}
