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
    Cam(String n)
    {
        ngaynhap = n;
    }
    Cam(String l, String xx, String nn)
    {
        super.setLoai(l);
        super.setXuatxu(xx);
        ngaynhap = nn;
    }

    @Override
    public String toString() {
        return super.toString()+"\nNgay nhap: "+ngaynhap;
    }

    public static void main(String[] args)
    {
        Cam c = new Cam("Cam","Trung Quoc","02/03/2018");
        System.out.println(c);
    }

}
