package week4.task1;

public class HoaQua {
    //TODO: Khai báo các thuộc tính cho HoaQua
    private String loai;
    private String xuatxu;
    //TODO: Khai báo các phương thức getter, setter cho HoaQua
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

    /**
     * Constructor1
     */
    HoaQua()
    {
    }

    /**
     * Constructor2
     * @param l
     * @param xx
     */
    HoaQua(String l, String xx)
    {
        this.loai = l;
        this.xuatxu = xx;
    }

    /**
     *
     * @return thong tin
     */
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
