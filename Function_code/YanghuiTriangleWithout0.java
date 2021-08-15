package normal_function;

/**
 * @ClassName: YanghuiTriangleWithout0
 * @Description: TODO 只输出有效区域的杨辉三角
 * @Author: NickShan
 * @Create: 2021-08-16 00:33
 * @Version 1.0
 **/
public class YanghuiTriangleWithout0 {
    /**
    * @Description: YHTriangle
    * @Param: [a]
    * @Author: NickShan
    * @Date: 2021/8/16 0:38
    */
    public static void YHTriangle(int[][] a)

    {

        int[][] data = initiWithout0(a);
        for(int i=2;i<data.length;i++) //从第二行开始赋值
        {
            for(int j=1;j<data[i].length-1;j++) //注意结束的位置
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
    * @Date: 2021/8/16 0:38
    */
    public static void OutputYHTriangle(int[][] data)
    {

        for (int[] datum : data) {
            for (int i : datum) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }


    /**
    * @Description: initiWithout0，初始化矩阵，注意需要初始化3个地方：数组的第二维度，每列第一个元素、每行最后一个元素
    * @Param: [a]
    * @Author: NickShan
    * @Date: 2021/8/16 0:38
    */
    public static int[][] initiWithout0 (int[][] a)
    {
        for (int i = 0; i < a.length; i++) {
            a[i]=new int[i+1];
            a[i][0]=1;
            a[i][i]=1;
        }

        return a;
    }

    public static void main(String[] args) {
        int[][] a =new int[10][]; //在这里控制杨辉三角的大小,只控制一个维度即可
        YHTriangle(a);

    }
}
