package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _1331 {
    public static void main(String[] args) {
        int[] arr = {37,12,28,9,100,56,80,5,12};
        arr = arrayRankTransform(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static int[] arrayRankTransform(int[] arr) {
        int len = arr.length;
        Map<Integer,Integer> map = new HashMap<>();
        int[] tmp = Arrays.copyOf(arr,len);
        Arrays.sort(tmp);
        int index = 1;
        for (int x:tmp) {
            if(map.get(x)==null){
                map.put(x,index);
                index++;
            }
        }
        for (int i = 0; i < len; i++) {
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}
