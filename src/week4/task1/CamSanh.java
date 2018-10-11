package week4.task1;

public class CamSanh extends Cam{
    int gia;

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    CamSanh(){};
    CamSanh(int g){
        gia = g;
    }
    CamSanh(String l, String xx, String nn,int g)
    {
        super.setLoai(l);
        super.setXuatxu(xx);
        super.setNgaynhap(nn);
        gia = g;
    }

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
