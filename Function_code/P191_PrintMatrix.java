package normal_function.course_prictices;

/**
 * @Author NickShan
 * @Date 2021/8/18 - 16:43
 */

/**
 * @ClassName: P191_PrintMatrix
 * @Description: TODO 尚硅谷p191,打印矩阵
 * @Author: NickShan
 * @Create: 2021-08-18 16:43
 * @Version 1.0
 **/

public class P191_PrintMatrix {
    public static void print10x8()
    {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                if(j==7)
                    System.out.println("*");
                else
                    System.out.print("*-");
            }

        }
    }
    public static int print10x8AndArea()
    {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                if(j==7)
                    System.out.println("*");
                else
                    System.out.print("*-");
            }

        }
        return 8*10;
    }
    public static int print10x8Par(int m,int n)
    {
//        System.out.println("面积为： 80" );
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(j==n-1)
                    System.out.println("*");
                else
                    System.out.print("*-");
            }

        }
        return m*n;
    }

    public static void main(String[] args) {
        print10x8();
        int area =print10x8AndArea();
        System.out.println("面积为： "+area);


        int area02= print10x8Par(20,20);
        System.out.println("面积为： "+area02);
    }
}
