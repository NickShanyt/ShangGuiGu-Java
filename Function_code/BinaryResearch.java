package normal_function;

/**
 * @Author NickShan
 * @Date 2021/8/16 - 23:45
 */

/**
 * @ClassName: BinaryResearch
 * @Description: TODO 数组的二分查找
 * @Author: NickShan
 * @Create: 2021-08-16 23:45
 * @Version 1.0
 **/

public class BinaryResearch {
    /**
    * @Description: binaryResearchInt int型的二分查找，需要数组有序
    * @Param: [a, n]
    * @Author: NickShan
    * @Date: 2021/8/17 0:00
    */
    public static void binaryResearchInt(int[] a,int n) //非递归版本
    {
        int len =a.length;
        int start=0;
        int end =len-1;
        boolean flag = true;
        while(flag){
            if(start>=end) {
                flag = false;
                break;
            }
            int mid = (start+end)/2 +1 ; //这里需要加1，因为java中除法向下取整，不加1会导致死循环
            if(a[mid]==n)
            {
                System.out.println("找到了，位置是: " + mid);
//                return mid; 如果要返回位置索引的话
                flag=false;
                break;
            }
            else if(a[mid] > n)
            {
                end = mid;
                continue;
            }
            else if (a[mid]<n)
            {
                start=mid;
                continue;
            }
        }
        if(flag==false)
        {
            System.out.println("没有找到");
        }

    }


    public static void main(String[] args) {
        int[] a=new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i]=i+1;
        } //简单初始化一下数组
        binaryResearchInt(a,20);

    }
}
