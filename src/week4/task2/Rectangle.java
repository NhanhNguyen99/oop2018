package week4.task2;

public class Rectangle extends Shape {
    private  double width = 1.0;
    private double length = 1.0;
    Rectangle(){};
    Rectangle(double width, double length)
    {
        this.width = width;
        this.length = length;
    }
    Rectangle(double width, double length, String color, boolean filled)
    {
        this.width = width;
        this.length = length;
        super.setColor(color);
        super.setFilled(filled);
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

    @Override
    public String toString() {
        if(width==length)
            return "***Square***\n"+super.toString()+"\nSize: "+length+"\nArea: "+getArea()+"\nPerimeter: "+getPerimeter();
        else if(width>length)
            return "Error: Width>Length!!!";
        else
            return "***Rectangle***\n"+super.toString()+"\nWidth: "+width+"\nLength: "+length+"\nArea: "+getArea()+"\nPerimeter: "+getPerimeter();
    }

    public static void main(String[] args)
    {
        Rectangle r = new Rectangle(5,6,"blue",true);
        System.out.println(r);
    }
}
