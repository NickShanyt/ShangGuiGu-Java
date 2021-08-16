package normal_function;
/**
 * @author NickShan
 * @data 2021/8/16 - 21:42
 */

/**
 * @ClassName: BasicAlgorithmOfArray
 * @Description: TODO 数组的基本算法实现
 * @Author: NickShan
 * @Create: 2021-08-16 21:42
 * @Version 1.0
 **/
class myArray {
//    private int[] array;

    //    public myArray(int n)
//    {
//        int[] array = new int[n];
//    }
    public static int sumArray(int[] a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

    public static double aveArray(int[] a) {
        int i = sumArray(a) / a.length;
        return i; //方式已经声明是返回double类型，这里就不用进行强制类型转换了
    }


    public static int maxArray(int[] a) {
        int mina = 0x80000000; //设置一个初始最小值
        for (int i : a) {
            if (i > mina) {
                mina = i;
            }
        }
        return mina;
    }

    public static int minArray(int[] a) {
        int maxa = 0x7fffffff;//设置一个初始最大值
        for (int i : a) {
            if (i < maxa) {
                maxa = i;
            }
        }
        return maxa;
    }
}
public class BasicAlgorithmOfArray {
    public static int[] randomNum(int n,int a, int b)
    {
        int[] temp = new int[n];
        for (int i = 0; i <temp.length ; i++) {
            temp[i] = (int)(Math.random()*(b-a +1));  //这里其实是有问题的，产生的仍然是1~100的整数
        }
        return temp;
    }
    public static void main(String[] args) {
//        int[] a = new int[]{-22,24,3,87,23,6,8};

        System.out.println("数组元素值和为: "+myArray.sumArray(randomNum(20,-50,50)));
        System.out.println("数组元素值平均值为: "+myArray.aveArray(randomNum(20,-50,50)));
        System.out.println("数组元素值最大值为: "+myArray.maxArray(randomNum(20,-50,50)));
        System.out.println("数组元素值最小值为: "+myArray.minArray(randomNum(20,-50,50)));

//        for (int i : randomNum(20, -50, 50)) {
//            System.out.println(i);
//        }
        System.out.println(285 / 1033.0);
    }

    }



