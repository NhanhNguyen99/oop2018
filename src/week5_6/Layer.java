package week5_6;
import java.util.ArrayList;
public class Layer{
   ArrayList<Shape> shapes = new ArrayList<Shape>();
   public void eraseTriangle()
   {
       for(int i=0;i<shapes.size();i++)
       {
            if(shapes.get(i) instanceof Triangle)
            {
                shapes.remove(i);
                i--;
            }
       }
   }
    public void eraseCircle()
    {
        for(int i=0;i<shapes.size();i++)
        {
            if(shapes.get(i) instanceof Circle)
            {
                shapes.remove(i);
                i--;
            }
        }
    }

}
