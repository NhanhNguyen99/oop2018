package week4.task2;

public class Circle extends Shape{
    double radius = 1.0;
    final double PI = 3.14;
    Circle(){};
    Circle(double r)
    {
        radius=r;
    }
    Circle(double r, String c, boolean f)
    {
        radius=r;
        color=c;
        filled=f;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea()
    {
        return PI*radius*radius;
    }

    public double getPerimeter()
    {
        return 2*PI*radius;
    }

    public String toString() {
        return "Color: "+color+" "+"Filled: "+isFilled()+" "+"Radius: "+radius+"\n"+"Area: "+getArea()+"\n"+"Perimeter: "+getPerimeter();
    }

    public static void main(String[] args)
    {
        Circle c = new Circle();
        System.out.println(c);
    }
}
