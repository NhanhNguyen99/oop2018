package week2.task1;

public class Task1 {

    public static int gcd(int a, int b) {
        // TODO: Tính ước chung lớn nhất của 2 số a, b
        if(a<0)
            a=-a;
        if(b<0)
            b=-b;
        if(a==0||b==0)
            return a+b;
        while(a!=b)
        {
            if(a>b)
                a=a-b;
            else
                b=b-a;
        }
        return a;
    }

    public static int fibonacci(int n) {
        // TODO: Tìm số fibonacci ở vị trí n
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else
            return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args)
    {
        System.out.println("UCLN cua a va b la: "+gcd(30,25));
        System.out.println("Fibonacci(n) = "+fibonacci(3));
    }

}
