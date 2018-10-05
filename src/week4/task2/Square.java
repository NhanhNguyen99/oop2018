package week4.task2;

public class Square extends Rectangle {
    Square(){}
    Square(double size)
    {
        width=length=size;
    }
    Square(double size, String color, boolean filled)
    {
        width=length=size;
        this.color=color;
        this.filled=filled;
    }
    public double getSize()
    {
        return width;
    }
    public void setSize(double size)
    {
        width=length=size;
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
