package array;

import java.util.ArrayList;

import java.util.List;

public class _969 {
    public static void main(String[] args) {
        int[] arr = {3,2,4,1,5,6};
        System.out.println(pancakeSort(arr));
    }
    public static List<Integer> pancakeSort(int[] arr) {
        List<Integer> result = new ArrayList<>();
        if(checkArr(arr)) return result;
        int len = arr.length;
        int r = len-1;
        int beg;
        while (!checkArr(arr)){
            for (beg = r; beg >=0 ; beg--) {//从beg开始找
                if(arr[beg]!=(beg+1)) break;
            }
            int index;
            for (index = 0; index <=beg; index++) {
                if(arr[index]==(beg+1)) break;
            }
            System.out.println(beg+","+index);
            //进行翻转
            reverse(arr,index);
            result.add(index+1);
            reverse(arr,beg);
            result.add(beg+1);
            for (int x:arr) {
                System.out.print(x+" ");
            }
            System.out.println();
        }
        return result;
    }

    private static void reverse(int[] arr, int r) {//将数组从第0个到第r个进行翻转
        int tmp;
        for (int i = 0; i <= r/2; i++) {
            tmp = arr[i];
            arr[i] = arr[r-i];
            arr[r-i] = tmp;
        }

    }

    private static boolean checkArr(int[] arr) {//判断是否有序
        if(arr.length==1) return true;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1]>arr[i]) return false;
        }
        return true;
    }
}
