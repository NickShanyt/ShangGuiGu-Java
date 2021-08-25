package normal_function.course_prictices.polymorphism;

/**
 * @Author NickShan
 * @Date 2021/8/25 - 16:00
 */

/**
 * @ClassName: P289_person
 * @Description: TODO
 * @Author: NickShan
 * @Create: 2021-08-25 16:00
 * @Version 1.0
 **/
class Person {
    protected String name = "person";
    protected int age = 50;

    public String getInfo() {
        return "ClassPerson:" + "\nName: " + name + "\n" + "age: " + age;
    }
}

class Student extends Person {
    protected String school = "pku";

    public String getInfo() {
        return "ClassStudent:" + "\nName: " + name + "\nage: " + age
                + "\nschool: " + school;
    }
}

class Graduate extends Student {
    public String major = "IT";

    public String getInfo() {
        return "ClassGraduate:" + "\nName: " + name + "\nage: " + age
                + "\nschool: " + school + "\nmajor:" + major;
    }
}

public class P289_practice5 {
    public static void method(Person e) {
        System.out.println(e.getInfo());
/*      //Person类是最高级父类，如果这样写，那么第一个判断一定是true，就一定不会区执行后面的判断了。
        if (e instanceof Person)
        {
            System.out.println(" a person");
        }
        else if (e instanceof Student) {
            System.out.println("a student");
            System.out.println("a person");
        }
        else if(e instanceof Graduate) {
            System.out.println("a student");
            System.out.println("a person");
            System.out.println("a graduate");
        }*/
        if (e instanceof Graduate) {
            System.out.println("a graduate");
        }
        if (e instanceof Student) {
            System.out.println("a student");
        }
        if (e instanceof Person) {
            System.out.println("a person");
        }
    }

    public static void main(String[] args) {
        Person per = new Person();
        P289_practice5.method(per);
        System.out.println("————————————————————————");
        Person stu = new Student();
        P289_practice5.method(stu);
        System.out.println("————————————————————————");
        Person gru = new Graduate();
        P289_practice5.method(gru);

    }
}
