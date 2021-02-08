package array;

public class _1144 {
    public static void main(String[] args) {
        int[] nums = {7,4,8,9,7,7,5};
        System.out.println(movesToMakeZigzag(nums));
    }
    public static int movesToMakeZigzag(int[] nums) {
        int len = nums.length;
        if(len==1) return 0;
        int a = 0;//奇数大
        int b = 0;//偶数大
        int[] tmp = new int[len];
        for (int i = 0; i < len; i++) {
            tmp[i] = nums[i];
        }
        for (int i = 0; i < len; i = i+2) {//奇数位置大
            if(i==0&&nums[1]>nums[0]) {
                a += nums[1]-nums[0]+1;//处理第一位
                nums[1] = nums[0]-1;//处理减后的值
                continue;
            }else if(i==0){
                continue;
            }
            if(i==len-1) {
                a += nums[len-2]>nums[len-1]?nums[len-2]-nums[len-1]+1:0;//处理最后一位
                continue;
            }
            //将两边的进行减法
            if(nums[i-1]>=nums[i]){
                a+=nums[i-1]-nums[i]+1;
                nums[i-1] = nums[i]-1;
            }
            if(nums[i+1]>=nums[i]){
                a+=nums[i+1]-nums[i]+1;
                nums[i+1] = nums[i]-1;
            }
//            for (int x:nums) {
//                System.out.print(x+" ");
//            }
//            System.out.println();
        }
        for (int i = 1; i < len; i = i+2) {//偶数位置大
            if(i==len-1) {
                b += tmp[len-2]>tmp[len-1]?tmp[len-2]-tmp[len-1]+1:0;//处理最后一位
                continue;
            }
            //将两边的进行减法
            if(tmp[i-1]>=tmp[i]){
                b+=tmp[i-1]-tmp[i]+1;
                tmp[i-1] = tmp[i]-1;
            }
            if(tmp[i+1]>=tmp[i]){
                b+=tmp[i+1]-tmp[i]+1;
                tmp[i+1] = tmp[i]-1;
            }
        }
//        System.out.println(a+","+b);
        return Math.min(a,b);
    }
}
