package array;

public class _605 {
    public static void main(String[] args) {
        int[] f = {1,0,0,0,0,0,1};
        System.out.println(canPlaceFlowers(f,1));
    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        //从左边种，左边添加一个0，count初始化为1
        int count = 1;
        int num = 0;//记录总共能种多少朵花
        for (int i = 0; i < flowerbed.length; i++) {
            if(flowerbed[i]==0) {
                count++;
            }else {
                count=0;
            }
            if(count==3) {
                num++;
                count=1;
                if(num==n) return true;
            }
        }
        if(count==2) num++;//最右边的，只要有两朵花就行了
        System.out.println(num);
        return num>=n;
    }
}
