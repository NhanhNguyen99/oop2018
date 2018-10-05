package week4.task2;

public class Rectangle extends Shape {
    double width = 1.0, length = 1.0;
    Rectangle(){};
    Rectangle(double width, double length, String color, boolean filled)
    {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea()
    {
        return width*length;
    }
    public double getPerimeter()
    {
        return 2*(width+length);
    }

    public String toString() {
        return "Color: "+color+" Filled: "+filled+"\nWidth: "+width+" Length: "+length+"\nArea: "+getArea()+"\nPerimeter: "+getPerimeter();
    }

    public static void main(String[] args)
    {
        Rectangle r = new Rectangle();
        r.setLength(7.0);
        System.out.println(r);
    }
}
