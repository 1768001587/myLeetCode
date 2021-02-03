package array;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class _381 {
}
class RandomizedCollection {

    Map<Integer,Integer> map;
    int[] nums;
    int size;
    Random random = new Random();
    /** Initialize your data structure here. */
    public RandomizedCollection() {
        map = new HashMap<>();
    }

    /** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
    public boolean insert(int val) {
        if(map.containsKey(val)){
            int a = map.get(val);
            a++;
            map.put(val,a);
            return false;
        }else {
            map.put(val,1);
            return true;
        }
    }

    /** Removes a value from the collection. Returns true if the collection contained the specified element. */
    public boolean remove(int val) {
        if(map.containsKey(val)){
            int a = map.get(val);
            a--;
            map.put(val,a);
            if(a==0){
                map.remove(val,0);
            }
            return true;
        }else{
            return false;
        }
    }

    /** Get a random element from the collection. */
    public int getRandom() {
        size = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+":"+entry.getValue());
            size+=entry.getValue();
        }
        nums = new int[size];
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                nums[index] = entry.getKey();
                index++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
        return nums[random.nextInt(size)];
    }
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */