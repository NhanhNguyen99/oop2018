package week4.task1;

public class CamCaoPhong extends Cam{
    private int gia;

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    CamCaoPhong(){}
    CamCaoPhong(int g){
        gia = g;
    }
    CamCaoPhong(String l, String xx, String nn,int g)
    {
        super.setLoai(l);
        super.setXuatxu(xx);
        super.setNgaynhap(nn);
        gia = g;
    }
    @Override
    public String toString() {
        return super.toString()+"\nGia: "+gia;
    }

    public static void main(String[] args)
    {
        CamCaoPhong ccp = new CamCaoPhong("Cam Cao Phong","SaPa","18/07/2018",2500);
        ccp.setGia(4000);
        System.out.println(ccp);
    }
}
