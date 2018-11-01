package week7.task1;

public class Numeral extends Expression{
    private int value;
    public Numeral(int v)
    {
        value = v;
    }

    public Numeral(){}

    @Override
    public int evaluate() {
        return value;
    }

    @Override
    public String toString() {
        return "Numeral: value = "+value;
    }
}
