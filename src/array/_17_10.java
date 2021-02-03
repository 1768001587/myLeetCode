package array;

public class _17_10 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,3,4,3,3};
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        if(nums.length==0) return -1;
        if(nums.length==1) return nums[0];
        int result = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if(result==nums[i]){
                count++;
            }else {
                count--;
                if(count<0){
                    result = nums[i];
                    count = 1;
                }
            }
        }
        if(count<=0) return -1;
        else count=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==result) count++;
        }
        if(count>nums.length/2) return result;
        return -1;
    }
}
