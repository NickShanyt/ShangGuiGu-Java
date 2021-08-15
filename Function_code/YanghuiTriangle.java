package normal_function;

/**
 * @author NickShan
 * @data 2021/8/15 - 23:28
 */
public class YanghuiTriangle {

/**
* @Description: YHTriangle
* @Param: [a] 二维数组a
* @Author: NickShan
* @Date: 2021/8/15 23:58
*/
    public static void YHTriangle(int[][] a)
            //主要函数
    {
        int[][] data = initialization(a);
        for(int i=1;i<data.length;i++)
        {
            for(int j=1;j<data[i].length;j++)
            {
                data[i][j]=data[i-1][j-1]+data[i-1][j];
            }
        }
        OutputYHTriangle(data);
    }

    /**
    * @Description: OutputYHTriangle
    * @Param: [data]
    * @Author: NickShan
    * @Date: 2021/8/15 23:57
    */
    public static void OutputYHTriangle(int[][] data)
    {
        //输出杨辉三角
        for (int[] datum : data) {
            for (int i : datum) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

   /**
   * @Description: initialization 初始化
   * @Param: [a]
   * @Author: NickShan
   * @Date: 2021/8/15 23:59
   */
    public static int[][] initialization(int[][] a)
            //初始化操作
    {
        for (int[] ints : a) {
            ints[0]=1;
        }
        return a;
    }

    public static void main(String[] args) {
        int[][] a =new int[20][20];
        YHTriangle(a);
//        System.out.println("args = " + Arrays.deepToString(b));//ok,初始化成功

    }
}
