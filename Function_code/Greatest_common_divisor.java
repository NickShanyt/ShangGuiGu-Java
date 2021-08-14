package normal_function;

import java.util.Scanner;

/**
 * @author NickShan
 * @data 2021/8/14 - 18:36
 */
public class Greatest_common_divisor {
    public static int Gcd(int numa,int numb)
    {/*
    辗转相除法求最大公约数
    */
        int r=1;
        while (numb!=0)
        {
            r = numa % numb;
            numa=numb;
            numb=r;
        }
        return numa;
    }
    public static int Lcm(int numa,int numb)
    {
        /*
        Least common multiple
         */
//        System.out.println(Gcd(numa,numb));

        return ((numa*numb)/Gcd(numa,numb));
    }

    public static void main(String[] args) {
        /*
        最小公倍数 = 两整数的乘积 / 最大公约数
        问题转换为先求“最小公倍数”
        最小公倍数使用 “辗转相除法” 进行求得
         */
        Scanner numa = new Scanner(System.in);
        Scanner numb = new Scanner(System.in);
        System.out.println("请输入2个数字： ");
        int a =numa.nextInt();
        int b =numb.nextInt();
        System.out.println("最大公约数："+Gcd(a,b));
        System.out.println("最小公倍数："+Lcm(a,b));
    }
}
