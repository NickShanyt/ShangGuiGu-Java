package normal_function.course_prictices;

/**
 * @Author NickShan
 * @Date 2021/8/18 - 16:58
 */

/**
 * @ClassName: P192_ClassStudent
 * @Description: TODO P192练习：学生类————对象数组
 * @Author: NickShan
 * @Create: 2021-08-18 16:58
 * @Version 1.0
 **/
class Student {
    int number;//学号
    int state = (int) (Math.random() *(6- 1 + 1) +1);//年级,随机数固定格式：要求范围在2~6，则先乘6-2+1 ，最后的+1，指从1开始
    int score = (int) (Math.random() * (100 - 0 + 1) + 0);//成绩,范围：0~100。最后的+0，指的是从0开始

    Student(int num) {
        this.number = num;
    }
    String info() {

        return "学号： " + this.number + " ———— " +
                "年级： " +this.state +" ———— "+
                "分数: "+this.score + '\n';
    }

}

public class P192_ClassStudent {


    public static void main(String[] args) {
//        int a = (int)(Math.random()*10+1);
//        System.out.println(a);
        Student[] s2 = new Student[20];
        for (int i = 0; i < 20; i++) {
//            s2[i].number=i; //没有构造函数就按这个赋值
/*
P202 有解释
 这里踩坑了，不能这样赋值。因为在上面的语句中，Student[] s2= new Student[20];
 s2是在【栈】中开辟的一个空间，Student[20]是在【堆】中开辟了一个足够存储20个Student类的地址的空间——————用来存储地址的空间，这个地址也是堆中的地址
 s2指向这个【堆】中空间的首地址，那么s2[i]指向的就是 存储着 具体第i个对象的地址的堆的 空间的地址
 但是，实际上初始化时 这些空间都还是空的，是NULL的，还没有存地址
即： 1、Student[] s2= new Student[20]; 申请堆中的空间，这个空间是一个用来存放实际20个对象的地址的数组空间，但目前数组中的值均为NULL
    2、s2[i]=new Student(); 在堆中申请一个空间用来存放一个Student类的对象，并将该空间的地址，赋给用于存放地址的空间s2[i]





*/
            s2[i] = new Student(i+1); //类中定义了构造函数，因此这里直接传参
        }
        for (Student studentTest : s2) {
            if (studentTest.state == 3){
//                System.out.println("该学生学号为： " + studentTest.number);
//                System.out.println("该学生成绩为： " + studentTest.score);
//                System.out.println("———————————————");
                System.out.println(studentTest.info());
            }

//            PopSorts.popSortOfInt();
        }

    }

}
