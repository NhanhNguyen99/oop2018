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

    public void getInfo()
    {
        System.out.println(getLoai()+"\t\t"+getXuatxu()+"\t"+ngaynhap);
    }
    public static void main(String[] args)
    {
        Tao t = new Tao();
        t.setLoai("Tao");
        t.setXuatxu("Sa Pa");
        t.setNgaynhap("02/03/2000");
        t.getInfo();

    }
}
