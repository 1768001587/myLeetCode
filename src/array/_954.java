package array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class _954 {
    public static void main(String[] args) {
        int[] arr = {2,1,2,6};
        System.out.println(canReorderDoubled(arr));
    }
    public static boolean canReorderDoubled(int[] arr) {
        Map<Integer,Integer> count = new HashMap<>();
        int len = arr.length;
        for(int key:arr){
            count.put(key,count.getOrDefault(key,0)+1);//getOrDefault(key,0)如果找得到就为key，否则就为0
        }
        Integer[] B = new Integer[len];
        for (int i = 0; i < len; i++) {
            B[i] = arr[i];
        }
        Arrays.sort(B, Comparator.comparingInt(Math::abs));//构建排序规则，按照绝对值后的大小排序
        for(Integer x:B){//从绝对值最小的开始找，最小的x一定对应着2*x
            //从小到大找
            if(count.get(x)==0) continue;//已经被消耗了的
            //下面为已经找到了的
            if(count.getOrDefault(2*x,0)<=0) return false;
            count.put(x,count.get(x)-1);
            count.put(2*x,count.get(2*x)-1);//分别消耗x和2x
        }
        return true;
    }
}
