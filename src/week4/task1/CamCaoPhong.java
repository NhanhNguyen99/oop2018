package week4.task1;

public class CamCaoPhong extends Cam{
    int gia;

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    CamCaoPhong(){};
    public static void main(String[] args)
    {
        CamCaoPhong ccp = new CamCaoPhong();
        ccp.setGia(4000);
        ccp.getInfo();
        System.out.println(ccp.getGia()+"\t"+ccp.getNgaynhap());
    }
}
