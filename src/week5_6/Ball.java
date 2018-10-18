package week5_6;

public class Ball {
    double x=0, y=0;
    double delX = 1, delY = 1;
    public void move()
    {
        if (x < 0 || x > 500 - 40)
            delX = -delX;
        if (y < 0 || y > 600 - 40)
            delY = -delY;
        x = x + delX;
        y = y + delY;
    }
}
