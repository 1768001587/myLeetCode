package array;

import java.util.ArrayList;
import java.util.List;

public class _78 {
    public static void main(String[] args) {
        int[] nums = {1};
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
        result.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            int size = result.size();
            List<Integer> tmp;
            for (int j = 0; j < size; j++) {//每次遍历向当前所有集合中添加当前遍历的元素，组成新的集合
                tmp = new ArrayList<>(result.get(j));
                tmp.add(nums[i]);
                result.add(tmp);
            }
        }
        return result;
    }
}
