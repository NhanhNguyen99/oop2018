package week4.task1;

public class Cam extends HoaQua{
    //TODO: Khai báo các thuộc tính cho Cam
    private String ngaynhap;
    //TODO: Khai báo các phương thức getter, setter cho Cam
    public String getNgaynhap()
    {
        return ngaynhap;
    }

    public void setNgaynhap(String n)
    {
        ngaynhap=n;
    }

    /**
     * Constructor1
     */
    Cam(){
        ngaynhap = "01/01/2017";
    }

    /**
     * Constructor2
     * @param n
     */
    Cam(String n)
    {
        ngaynhap = n;
    }

    /**
     * Constructor3
     * @param l
     * @param xx
     * @param nn
     */
    Cam(String l, String xx, String nn)
    {
        super.setLoai(l);
        super.setXuatxu(xx);
        ngaynhap = nn;
    }

    /**
     *
     * @return thông tin Cam
     */
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
