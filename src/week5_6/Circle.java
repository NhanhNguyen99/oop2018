package week5_6;

import java.util.ArrayList;

public class Circle extends Shape {
    private double radius;
    private Point center;


    public Circle(String color, boolean filled, double radius, Point center) {
        super(color, filled);
        this.radius = radius;
        this.center = center;
    }

    public Circle(double radius, Point center) {
        this.radius = radius;
        this.center = center;
    }

    public Circle(double radius) {
        this.radius = radius;
        this.center = new Point();
    }

    public Circle() {
        this(1.0);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }


    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

}
