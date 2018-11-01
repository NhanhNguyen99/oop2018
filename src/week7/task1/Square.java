package week7.task1;

public class Square extends Expression{
    private Expression expression;
    public Square(Expression e)
    {
        expression = e;
    }

    @Override
    public int evaluate() {
        return expression.evaluate()*expression.evaluate();
    }

    @Override
    public String toString() {
        return "Square: Expression = "+expression;
    }
}
