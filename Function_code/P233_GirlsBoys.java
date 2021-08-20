package normal_function.course_prictices;

/**
 * @Author NickShan
 * @Date 2021/8/20 - 15:03
 */

/**
 * @ClassName: P233_GirlsBoys
 * @Description: TODO this 关键字的练习
 * @Author: NickShan
 * @Create: 2021-08-20 15:03
 * @Version 1.0
 **/
class Boy {
    private String name;
    private int age;

    public Boy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String i) {
        this.name = i;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int i) {
        this.age = i;
    }
    public void marry(Girl girl)
    {
        System.out.println("She is a "+girl.getName());

    }

}
class Girl{
    private String name;
    private int age;
    public Girl()
    {

    }

    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void marry(Boy boy)
    {
        System.out.println("He is a "+boy.getName());
        boy.marry(this);
    }
    /**
    * @Description: 比较两个对象的大小
    * @Param: [girl]
    * @Author: NickShan
    * @Date: 2021/8/20
    * @return:  正数：当前对象大；负数：当前对象小；0：相等
    */
    public int compare(Boy boy){
//        if(this.getAge()>boy.getAge())
//            return 1;
//        else if (this.getAge()<boy.getAge())
//            return -1;
//        else return 0;
            return this.age-boy.getAge();
    }
}
    public class P233_GirlsBoys
{
    public static void main(String[] args) {
        Girl a = new Girl("girl", 20);
        Boy b = new Boy("boy",21);
        a.marry(b);
        int bs = a.compare(b);
        System.out.println(bs);
    }



}
