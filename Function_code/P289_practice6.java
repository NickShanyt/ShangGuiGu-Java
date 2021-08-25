package normal_function.course_prictices.polymorphism;

/**
 * @Author NickShan
 * @Date 2021/8/25 - 16:22
 */

/**
 * @ClassName: P289_practice6
 * @Description: TODO
 * @Author: NickShan
 * @Create: 2021-08-25 16:22
 * @Version 1.0
 **/

class GeometricObject{
    protected String color;
    protected double weight;

    protected GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }
    public double findArea()
    {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}
class Circle extends GeometricObject{
    private double radius;

    public Circle(double radius,String color, double weight) {
        super(color, weight);
        this.radius = radius;
    }
    public double findArea()
    {
        return Math.PI*this.radius*this.radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
class MyRectangle extends GeometricObject{
    private double width;
    private double height;

    public MyRectangle(double width, double height ,String color, double weight) {
        super(color, weight);
        this.width = width;
        this.height = height;
    }
    public double findArea()
    {
        return this.width*this.height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
public class P289_practice6 {
    public static boolean  equalsArea(GeometricObject a,GeometricObject b)
    {
        return a.findArea()==b.findArea();
    }
    public static void displayGeometricObject(GeometricObject a)
    {
        System.out.println("该图形面积为："+ a.findArea());
    }

    public static void main(String[] args) {
        GeometricObject c = new Circle(2,"white",10);
        GeometricObject r = new MyRectangle(3,4,"black",10);
        GeometricObject r2 = new MyRectangle(3,4,"white",11);
        System.out.println(P289_practice6.equalsArea(r, r2));
        System.out.println(P289_practice6.equalsArea(c, r));
        P289_practice6.displayGeometricObject(c);
        P289_practice6.displayGeometricObject(r);


    String a ;
    a.equals()
    }
}
