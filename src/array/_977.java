package array;

public class _977 {
    public static void main(String[] args) {
        int[] nums = {-4,-1,2,3,10};
        sortedSquares(nums);
    }
    public static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int index = nums.length-1;
        int r = nums.length-1;
        int l = 0;
        while (r>=l){
            int a = nums[r]*nums[r];
            int b = nums[l]*nums[l];
            if(a>b){
                result[index] = a;
                r--;
            }else {
                result[index] = b;
                l++;
            }
            index--;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(result[i]);
        }
        return result;
    }
}
