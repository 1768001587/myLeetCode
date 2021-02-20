package array;

public class _1409 {
    public static void main(String[] args) {
        int[] queries = {3,1,2,1};
        int[] result = processQueries(queries,5);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
    public static int[] processQueries(int[] queries, int m) {
        int[] tmp = new int[m];
        for (int i = 0; i < m; i++) {
            tmp[i] = i+1;//赋值
        }
        int num;
        for (int i = 0; i < queries.length; i++) {
            int a = queries[i];
            for (int j = 0; j < m; j++) {
                if(a==tmp[j]){
                   // System.out.println("j="+j);
                    queries[i] = j;
                    //交换tmp，将第j个位置移到第一个位置,并把前面的进行后移
                    num = tmp[j];
                    for (int k = j; k >0; k--) {
                        tmp[k] = tmp[k-1];
                    }
                    tmp[0] = num;
                    break;
                }
            }
        }
        return queries;
    }
}
