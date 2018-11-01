package week7.task1;

public class Division extends  BinaryExpression{
    private Expression left;
    private Expression right;

    public Expression getLeft() {
        return left;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public Expression getRight() {
        return right;
    }

    public void setRight(Expression right) {
        this.right = right;
    }

    public Division(Expression left, Expression right)
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
        return "Addition: \nleft = "+left+"\nright = "+right;
    }

    @Override
    public int evaluate(){
       // try {
            return left.evaluate() / right.evaluate();
      //  } catch (ArithmeticException e) {
      //      System.out.println("Error ArithmeticException");
       //     return 0;
       // }
    }
}
