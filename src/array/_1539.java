package array;

import java.util.ArrayList;
import java.util.List;

public class _1539 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        System.out.println(findKthPositive(arr,5));
    }
    public static int findKthPositive(int[] arr, int k) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            //2前面缺少了1个数  3前面缺少了1个数 7前面缺少了3个数 11前面缺少了6个数
            //返回k+i
            if(arr[i]-i-1>=k){//代表arr[i]前面缺少了多少个数
                return k+i;
            }
        }
        return k+len;
    }
}
