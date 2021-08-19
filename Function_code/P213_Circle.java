package normal_function.course_prictices;

/**
 * @Author NickShan
 * @Date 2021/8/19 - 17:19
 */

/**
 * @ClassName: P213_Circle
 * @Description: TODO
 * @Author: NickShan
 * @Create: 2021-08-19 17:19
 * @Version 1.0
 **/
class Circle {
    double radius;

    protected double findArea(double r) {
        return Math.PI * r * r;
    }
}

class PassObject {

    public static void printAreas(Circle c, double time) {
        System.out.println("Radius          Area");
        for (int i = 1; i < time; i++) {
            System.out.println(i + "               " + c.findArea(i));
        }
    }
}

public class P213_Circle {
    public static void main(String[] args) {
        PassObject.printAreas(new Circle(), 6);
    }
}
