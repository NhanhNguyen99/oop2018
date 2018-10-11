package week4.task1;

public class Tao extends HoaQua{
    private String ngaynhap;

    public String getNgaynhap()
    {
        return ngaynhap;
    }

    public void setNgaynhap(String n)
    {
        ngaynhap=n;
    }

    Tao(){}
    Tao(String n)
    {
        ngaynhap = n;
    }
    Tao(String l, String xx, String nn)
    {
        super.setLoai(l);
        super.setXuatxu(xx);
        ngaynhap = nn;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args)
    {
        Tao t = new Tao();
        t.setLoai("Tao");
        t.setXuatxu("Sa Pa");
        t.setNgaynhap("02/03/2000");
        System.out.println(t);

    }
}
