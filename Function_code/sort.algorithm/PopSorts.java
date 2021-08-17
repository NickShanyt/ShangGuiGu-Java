package sortsAlgorithm;

/**
 * @Author NickShan
 * @Date 2021/8/17 - 16:06
 */

/**
 * @ClassName: PopSorts
 * @Description: TODO 冒泡排序
 * @Author: NickShan
 * @Create: 2021-08-17 16:06
 * @Version 1.0
 **/

public class PopSorts {

    /**
     * @Description: swap  交换两int数a，b的算法，其实现方法可以有多种实现，这里采用简单的一种
     * @Param: [a, b]
     * @Author: NickShan
     * @Date: 2021/8/17 16:11
     */
    private static void swap(int[] array, int a, int b) //问题在于，交换两个数字的函数是值传递，调用该函数后，原调用该函数的位置的值并不会发生改变
    {
        int temp;
        temp = array[a];
        array[a] = array[b];
        array[b] = temp;

    }

    public static int[] popSortOfInt(int[] array) {
        boolean flag = true;
        for (int i = 0; i < array.length - 1; i++) { //控制每轮循环开始位置
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) { // j < j+1 从大到小排序, j>j+1从小到大排序
//                    swap(array, j + 1, j);
                    swap(array, j, j+1);
                }
            }

        }
        return array;

    }
}
