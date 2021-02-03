package array;

public class _15535 {
    public static void main(String[] args) {
        int[] arr  ={1,11,22,33,44,55,66,77,88,99};
        System.out.println(getWinner(arr,100000));
    }
    public static int getWinner(int[] arr, int k) {
        if(k==1) return Math.max(arr[0],arr[1]);
        int maxNum = Math.max(arr[0],arr[1]);
        int count = 1;
        for (int i = 2; i < arr.length; i++) {
            if(maxNum>arr[i]) {
                count++;
                if(count>=k) return maxNum;
            }else{
                maxNum = arr[i];
                count = 1;
            }
        }
        return maxNum;
    }
}
