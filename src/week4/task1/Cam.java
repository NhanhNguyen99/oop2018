package week4.task1;

public class Cam extends HoaQua{
    private String ngaynhap;

    public String getNgaynhap()
    {
        return ngaynhap;
    }

    public void setNgaynhap(String n)
    {
        ngaynhap=n;
    }

    Cam(){
        ngaynhap = "01/01/2017";
    }

    public static void main(String[] args)
    {
        Cam c = new Cam();
        c.getInfo();
        System.out.println(c.ngaynhap);
    }

}
