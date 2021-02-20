package array;

public class _1266 {
    public static void main(String[] args) {
        int[][] points = {{1,1},{3,4},{-1,0}};
        System.out.println(minTimeToVisitAllPoints(points));
    }
    public static int minTimeToVisitAllPoints(int[][] points) {
        int len = points.length;
        if(len==0) return 0;
        int result = 0;
        for (int i = 0; i < len-1; i++) {
            result+=getMin(points[i],points[i+1]);
        }
        return result;
    }

    private static int getMin(int[] point0, int[] point1) {
        int xabs = Math.abs(point0[0]-point1[0]);
        int yabs = Math.abs(point0[1]-point1[1]);
        if(xabs==yabs) return xabs;//在对角线上
        else return Math.min(xabs,yabs)+Math.abs(xabs-yabs);
    }
}
