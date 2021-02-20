package array;

import java.util.ArrayList;
import java.util.List;

public class _442 {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        findDuplicates(nums);
    }
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int a = Math.abs(nums[i]);
            if(nums[a-1]<0) {
                //System.out.println(a);
                result.add(a);
            }
            else nums[a-1] *= -1;
        }
        return result;
    }
}
