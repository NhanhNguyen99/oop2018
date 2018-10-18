package week4.task1;

public class CamCaoPhong extends Cam{
    //TODO: Khai báo các thuộc tính cho CamCaoPhong
    private int gia;
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
    CamCaoPhong(){}

    /**
     * Constructor2
     * @param g
     */
    CamCaoPhong(int g){
        gia = g;
    }

    /**
     * Constructor3
     * @param l
     * @param xx
     * @param nn
     * @param g
     */
    CamCaoPhong(String l, String xx, String nn,int g)
    {
        super.setLoai(l);
        super.setXuatxu(xx);
        super.setNgaynhap(nn);
        gia = g;
    }

    /**
     *
     * @return thông tin CamCaoPhong
     */
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
