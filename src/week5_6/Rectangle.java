package week5_6;

public class Rectangle extends Shape {
    private Point O;
    private double width;
    private double height;

    public Rectangle(String color, boolean filled, Point center, double width, double height) {
        super(color, filled);
        this.O = center;
        this.width = width;
        this.height = height;
    }

    public Rectangle(Point center, double width, double height) {
        this.O = center;
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height) {
        this.O = new Point();
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
        this(1.0, 1.0);
    }

    public Point getCenter() {
        return O;
    }

    public void setCenter(Point center) {
        this.O = center;
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

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return 0;
        // TODO: handle get perimeter.
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}