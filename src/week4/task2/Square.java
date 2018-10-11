package week4.task2;

public class Square extends Rectangle {
    Square(){}
    Square(double size)
    {
        new Rectangle(size,size);
    }
    Square(double size, String color, boolean filled)
    {
        new Rectangle(size,size,color,filled);
    }
    public double getSize()
    {
        return super.getWidth();
    }
    public void setSize(double size)
    {
        super.setLength(size);
        super.setWidth(size);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args)
    {
        Square sq = new Square();
        sq.setSize(3.0);
        System.out.println(sq);
    }
}
