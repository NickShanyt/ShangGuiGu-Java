package normal_function;

/**
 * @author NickShan
 * @data 2021/8/14 - 22:04
 */
public class nine_nine {
    public static void nineNine()
    {
        //九九乘法表
        for(int i=1;i<=9;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+"*"+j+" = "+(i*j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        nineNine();

    }
}
