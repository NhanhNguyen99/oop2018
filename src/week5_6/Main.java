package week5_6;

public class Main {
    public static void main(String[] args)
    {
        Diagram d = new Diagram();
        Layer L1 = new Layer();
        Layer L2 = new Layer();
        Layer L3 = new Layer();
        d.layers.add(L1);
        Point A = new Point();
        A.setX(1);
        A.setY(1);
        Point B = new Point();
        B.setX(2);
        B.setY(2);
        Point C = new Point();
        C.setX(4);
        C.setY(4);
        L1.shapes.add(new Circle("red",true,3.4,A));
        L1.shapes.add(new Circle("blue",true,3.4,A));
        L1.shapes.add(new Triangle("orange",false,A,B,C));
        //L1.eraseCircle();
        d.eraseCircleDiagram();
        System.out.println(L1.shapes.get(0));
    }
}
