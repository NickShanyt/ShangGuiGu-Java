package normal_function.course_prictices;

/**
 * @Author NickShan
 * @Date 2021/8/20 - 10:36
 */

/**
 * @ClassName: P230_Constructor
 * @Description: TODO
 * @Author: NickShan
 * @Create: 2021-08-20 10:36
 * @Version 1.0
 **/

public class P230_Constructor {
    int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public P230_Constructor(int a)
    {
        this.a=a;
    }

    public static void main(String[] args) {
        System.out.println("test");
        int bss=2;
        P230_Constructor a= new P230_Constructor(2);
    }
}
