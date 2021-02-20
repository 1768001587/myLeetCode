package array;

import java.util.Arrays;

public class _16_06 {
    public static void main(String[] args) {
        int[] a = {48,9};
        int[] b = {5};
        System.out.println(smallestDifference(a,b));
    }
    public static int smallestDifference(int[] a, int[] b) {
        int len1 = a.length;
        int len2 = b.length;
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0;int j=0;
        long min = Integer.MAX_VALUE;
        while (i<len1&&j<len2){
            if(a[i]>b[j]){
                min = Math.min((long)a[i]-b[j],min);
                j++;
            }else {
                min = Math.min((long)b[j]-a[i],min);
                i++;
            }
        }
        return (int)min;
    }
}
