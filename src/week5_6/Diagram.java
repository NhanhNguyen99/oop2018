package week5_6;
import java.util.ArrayList;
public class Diagram{
    ArrayList<Layer> layers = new ArrayList<Layer>();
    public void eraseCircleDiagram()
    {
        for(int i=0;i<layers.size();i++)
        {
            layers.get(i).eraseCircle();
        }
    }
}
