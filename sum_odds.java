package normal_function;

/**
 * @author NickShan
 * @data 2021/8/14 - 21:13
 */

public class sum_odds {
    public static int sumOdds(int end) //计算从1到end的奇数的和
    {
        int sum=0;
        for(int i=3;i<=100;i++)//从3开始，最后+1
        {
            if(i % 2 !=0 )
            {
                sum+=i;
            }
        }
        return (sum + 1);

    }
    public static void main(String[] args) {
        System.out.println(sumOdds(100));
    }
}
