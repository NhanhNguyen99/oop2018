package week7.task1;

public class Subtraction extends BinaryExpression{
    private Expression left;
    private Expression right;


    public Subtraction(Expression left, Expression right)
    {
        this.left = left;
        this.right = right;
    }

    @Override
    public Expression left() {
        return left;
    }

    @Override
    public Expression right() {
        return right;
    }

    @Override
    public String toString() {
        return "Subtraction: \nleft = "+left+"\nright = "+right;
    }

    @Override
    public int evaluate() {
        return left.evaluate() - right.evaluate();
    }
}
