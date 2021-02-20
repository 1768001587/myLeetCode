package array;

import java.util.*;

public class _1424 {
    public static int[] findDiagonalOrder(List<List<Integer>> nums) {
        int len = 0;
        Map<Integer,List<Integer>> map = new LinkedHashMap<>();//LinkedHashMap 是HashMap的一个子类，保存了记录的插入顺序，以下先插入数值小的
        List<Integer> tmp;
        for (int i = 0; i < nums.size(); i++) {
            List<Integer> list = nums.get(i);
            len += list.size();
            for (int j = 0; j < list.size(); j++) {
                if(map.containsKey(i+j)){//放入同一组中
                    map.get(i+j).add(list.get(j));
                }else {
                    tmp = new ArrayList<>();
                    tmp.add(list.get(j));
                    map.put(i+j,tmp);
                }
            }
        }
        int[] result = new int[len];//初始化
        int index = 0;
        for (int key:map.keySet()) {
            tmp = map.get(key);
            for (int j = tmp.size()-1; j >= 0; j--) {//与插入得顺序相反
                result[index] = tmp.get(j);
                index++;
            }
        }
        return result;
    }
}
