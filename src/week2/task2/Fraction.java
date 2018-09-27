package week2.task2;
import week2.task1.Task1;
public class Fraction {

    // TODO: khai báo các thuộc tính
    private int n, d;

    // TODO: khai báo các phương thức getter, setter cho n, d
    public int getN() {
            return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        this.n = numerator;
        this.d = denominator;
    }
    //

    public Fraction process(Fraction other)
    {
        //TODO: Xu ly phan so
        int k = Task1.gcd(other.n, other.d);
        other.n = other.n/k;
        other.d = other.d/k;
        if(other.n<0 && other.d<0)
        {
            other.n = -other.n;
            other.d = -other.d;
        }
        if(other.n>0 && other.d<0)
        {
            other.n = -other.n;
            other.d = -other.d;
        }
        Fraction f= new Fraction(other.n, other.d);
        return f;
    }

    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        if(this.d !=0 && other.d != 0)
        {
            int tu = this.n*other.d + this.d*other.n;
            int mau = this.d*other.d;
            Fraction f = new Fraction(tu, mau);
            f.process(f);
            return f;
        }
        else
        {
            Fraction s = new Fraction(0,0);
            return s;
        }
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        if(this.d !=0 && other.d != 0)
        {
            int tu = this.n*other.d - this.d*other.n;
            int mau = this.d*other.d;
            Fraction f = new Fraction(tu, mau);
            f.process(f);
            return f;
        }
        else
        {
            Fraction s = new Fraction(0,0);
            return s;
        }

    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        if(this.d !=0 && other.d != 0)
        {
            int tu = this.n*other.n;
            int mau = this.d*other.d;
            Fraction f = new Fraction(tu, mau);
            f.process(f);
            return f;
        }
        else
        {
            Fraction s = new Fraction(0,0);
            return s;
        }

    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        if(this.d !=0 && other.d != 0 && other.n !=0)
        {
            int tu = this.n*other.d;
            int mau = this.d*other.n;
            Fraction f = new Fraction(tu, mau);
            f.process(f);
            return f;
        }
        else
        {
            Fraction s = new Fraction(0,0);
            return s;
        }

    }

    public boolean equals(Object obj)
    {
        // TODO: Phương thức so sanh 2 phan so
        if(this.d !=0 && ((Fraction)obj).getD() != 0)
        {
            if(this.n*((Fraction)obj).getD() == this.d*((Fraction)obj).getN())
                return true;
            else
                return false;
        }
        else
            return false;
    }

    public void Output(Fraction F1, Fraction F2)
    {
        if((F1.getD()==0)||(F2.getD()==0))
        {
            System.out.println("Nhap sai phan so!!!");
        }
        else
        {
            if(F1.add(F2).getN()==0)
                System.out.println("Tong hai phan so F1 va F2 la: 0");
            else
                System.out.println("Tong hai phan so F1 va F2 la: "+F1.add(F2).getN()+"/"+F1.add(F2).getD());

            if(F1.subtract(F2).getN()==0)
                System.out.println("Hieu hai phan so F1 va F2 la: 0");
            else
                System.out.println("Hieu hai phan so F1 va F2 la: "+F1.subtract(F2).getN()+"/"+F1.subtract(F2).getD());

            if(F1.multiply(F2).getN()==0)
                System.out.println("Tich hai phan so F1 va F2 la: 0");
            else
                System.out.println("Tich hai phan so F1 va F2 la: "+F1.multiply(F2).getN()+"/"+F1.multiply(F2).getD());

            if(F2.getN()==0)
                System.out.println("Khong ton tai thuong hai phan so!!!");
            else
            if(F1.divide(F2).getN()==0)
                System.out.println("Thuong hai phan so F1 va F2 la: 0");
            else
                System.out.println("Thuong hai phan so F1 va F2 la: "+F1.divide(F2).getN()+"/"+F1.divide(F2).getD());

            if(F1.equals((Object)F2))
                System.out.println("Hai phan so bang nhau.");
            else
                System.out.println("Hai phan so khong bang nhau.");
        }
    }

    public static void main(String[] args)
    {
        Fraction F1 = new Fraction(-1,3);
        Fraction F2 = new Fraction(5,10);
        F1.Output(F1,F2);

    }
}
