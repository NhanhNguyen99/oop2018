package week4.task1;

public class HoaQua {
    private String loai;
    private String xuatxu;

    public String getLoai()
    {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getXuatxu() {
        return xuatxu;
    }

    public void setXuatxu(String xuatxu) {
        this.xuatxu = xuatxu;
    }
    HoaQua()
    {

    }
    HoaQua(String l, String xx)
    {
        this.loai = l;
        this.xuatxu = xx;
    }

    @Override
    public String toString() {
        return "Loai: "+loai+"\nXuat Xu: "+xuatxu;
    }
    public static void main(String[] args)
    {
        HoaQua hq = new HoaQua("Cam", "SaPa");
        System.out.println(hq);
    }
}
