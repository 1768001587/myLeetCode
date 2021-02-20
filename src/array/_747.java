package array;

public class _747 {
    public static void main(String[] args) {
        int[] nums = {3, 6, 1, 0};
        System.out.println(dominantIndex(nums));
    }
    public static int dominantIndex(int[] nums) {
        int len = nums.length;
        if(len==1) return 0;
        int m;
        int max;
        int second;
        if(nums[0]>=nums[1]){
            m = 0;max = nums[0];second=nums[1];
        }else {
            m = 1;max = nums[1];second=nums[0];
        }
        for (int i = 2; i < len; i++) {
            if(nums[i]>=max) {//先判断最大的
                second = max;
                max = nums[i];
                m = i;
            } else if(nums[i]>=second){//再判断第二大的，这里要用else if
                second = nums[i];
            }
        }
        System.out.println("second:"+second+" max:"+max);
        if(max>=second*2) return m;
        return -1;
    }
}
