package week7.task1;

public class ExpressionTest {
    public static void main(String[] args)
    {
        Numeral n10 = new Numeral(10);
        Numeral n0 = new Numeral(0);
        Numeral n1 = new Numeral(1);
        Numeral n2 = new Numeral(2);
        Numeral n3 = new Numeral(3);
        Numeral n6 = new Numeral(6);
        Square s1 = new Square(n10);
        Subtraction sub = new Subtraction(s1,n1);
        Multiplication mul = new Multiplication(n2,n3);
        Division div = new Division(n6,n0);

        Addition add = new Addition(sub,mul);

        Expression e = new Square(add);

        System.out.println(e.evaluate());
        try
        {
            System.out.println("Ket qua phep chia = "+div.evaluate());
        }
        catch (ArithmeticException ex)
        {
            System.out.println("Loi chia cho 0");
        }
    }
}
