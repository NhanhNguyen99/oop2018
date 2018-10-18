package week5_6;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class MoveBall extends JPanel {
    Circle[] c  = new Circle[3];
   // static double x=0, y=0;
   // static double delX = 1, delY = 1;

  /*  public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

  /*  private void move()
    {
            if (x < 0 || x > getWidth() - 40)
                delX = -delX;
            if (y < 0 || y > getHeight() - 40)
                delY = -delY;
            x = x + delX;
            y = y + delY;

    }*/
    public void paintComponent(Graphics g)
    {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;
            Ellipse2D circle = new Ellipse2D.Double(0,0,40,40);
            g2.fill(circle);

    }
    public static void main(String[] args) throws InterruptedException
    {
        MoveBall app = new MoveBall();
        app.c[0] = (new Circle("red",true,40,new Point(0,0)));
        app.c[1] = (new Circle("green",true,100,new Point(9,10)));
        app.c[2] = (new Circle("blue",true,60,new Point(200,300)));
        JFrame frame = new JFrame("Moving Ball");

        frame.add(app);
        frame.setSize(600,500);
        frame.setLocation(400,50);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        while(true)
        {
            for(int i=0;i<3;i++) {
                double x=app.c[i].getCenter().getX(), y=app.c[i].getCenter().getY();
                double delX = 1, delY = 1;
                if (x < 0 || x > 600 - 40)
                    delX = -delX;
                if (y < 0 || y > 500 - 40)
                    delY = -delY;
                x = x + delX;
                y = y + delY;
            }
            app.repaint();
            Thread.sleep(5);
        }
    }
}
