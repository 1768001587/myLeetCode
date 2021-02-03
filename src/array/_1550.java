package array;

public class _1550 {
    public static void main(String[] args) {
        int[] arr = {1,3,2};
        System.out.println(threeConsecutiveOdds(arr));
    }
    public static boolean threeConsecutiveOdds(int[] arr) {
        if(arr.length<=2) return false;
        int i = 0;int j;
        int count = 0;
        int index = toOdd(arr,i);
        j = index;
        while (j<arr.length){
            j = index;
            if(arr[j]%2==1){
                count++;
                j++;
                index = j;
                if(count==3) return true;
            }else {
                count=0;
                index = toOdd(arr,j);
                if(index==arr.length) return false;
            }
        }
        return false;
    }

    private static int toOdd(int[] arr, int i) {
        int j;
        for (j = i; j < arr.length; j++) {
            if(arr[j]%2==1) {
                break;
            }
            else {
                continue;
            }
        }
        return j;
    }
}
