package week4.task2;

public class Circle extends Shape{
    private double radius = 1.0;
    private final double PI = 3.14;
    Circle(){};
    Circle(double r)
    {
        radius=r;
    }
    Circle(double r, String c, boolean f)
    {
        radius=r;
        super.setColor(c);
        super.setFilled(f);
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

    @Override
    public String toString() {
        return "***Circle***\n"+super.toString()+"\nRadius: "+radius+"\nArea: "+getArea()+"\nPerimeter: "+getPerimeter();
    }

    public static void main(String[] args)
    {
        Circle c = new Circle(2,"yellow",false);
        System.out.println(c);
    }
}
