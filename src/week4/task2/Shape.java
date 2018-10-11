package week4.task2;

public class Shape {

    private    String color = "red";
    private    boolean filled = true;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    Shape(){}

    Shape(String color, boolean filled)
    {
        this.color=color;
        this.filled=filled;
    }

    public String toString() {
        return "Color: "+color +"\t\t"+"Filled: "+filled;
    }

    public static void main(String[] args)
    {
        Shape s = new Shape("Blue",true);
        System.out.println(s);
    }
}
