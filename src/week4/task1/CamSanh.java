package week4.task1;

public class CamSanh extends Cam{
    //TODO: Khai báo các thuộc tính cho CamCaoPhong
    int gia;
    //TODO: Khai báo các phương thức getter, setter cho CamCaoPhong
    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    /**
     * Constructor1
     */
    CamSanh(){};

    /**
     * Constructor2
     * @param g
     */
    CamSanh(int g){
        gia = g;
    }

    /**
     * Constructor3
     * @param l
     * @param xx
     * @param nn
     * @param g
     */
    CamSanh(String l, String xx, String nn,int g)
    {
        super.setLoai(l);
        super.setXuatxu(xx);
        super.setNgaynhap(nn);
        gia = g;
    }

    /**
     *
     * @return thông tin CamSanh
     */
    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args)
    {
        CamSanh cs = new CamSanh("Cam Sanh","Ha Giang","01/10/2018",10000);
        cs.setGia(9000);
        System.out.println(cs);

    }
}
