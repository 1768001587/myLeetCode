package array;

import java.util.ArrayList;
import java.util.List;

public class _78_1 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> result = subsets(nums);
        for (int i = 0; i < result.size(); i++) {
            for (int j = 0; j < result.get(i).size(); j++) {
                System.out.print(result.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        huisu(0,nums,result,tmp);
        return result;
    }

    private static void huisu(int i, int[] nums, List<List<Integer>> result, List<Integer> tmp) {
        result.add(new ArrayList<>(tmp));
        for (int j = i; j < nums.length; j++) {
            tmp.add(nums[j]);
            huisu(j+1,nums,result,tmp);
            tmp.remove(tmp.size()-1);
        }
    }
}
