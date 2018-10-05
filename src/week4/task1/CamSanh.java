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

    public void getInfo()
    {
        System.out.println(getLoai()+"\t\t"+getXuatxu()+"\t"+gia+"\t"+getNgaynhap());
    }
    public static void main(String[] args)
    {
        CamSanh cs = new CamSanh();
        cs.setGia(9000);
        cs.getInfo();

    }
}
