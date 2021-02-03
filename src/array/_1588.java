package array;

public class _1588 {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,3,6};
        System.out.println(sumOddLengthSubarrays(arr));
    }
    public static int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j=j+2) {
                sum = sum+getSum(arr,i,j);
            }
        }
        return sum;
    }

    private static int getSum(int[] arr, int begin, int end) {
        int sum = 0;
        for (int i = begin; i <=end ; i++) {
            sum+=arr[i];
        }
        return sum;
    }
}
