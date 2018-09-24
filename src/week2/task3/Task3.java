package week2.task3;

public class Task3 {
    SinhVien[] sv = new SinhVien[3];
    GiaoVien[] gv = new GiaoVien[3];
    UET[] uet = new UET[3];
    public static void main(String[] args)
    {
        Task3 t = new Task3();
        //TODO kiem tra class Sinh Vien
        t.sv[0] = new SinhVien("Nguyen Nhanh", "17020942","K62CF");
        t.sv[1] = new SinhVien("Tran Nghia", "17020928","K62CF");
        t.sv[2] = new SinhVien("Ly May","17020999","K62CQ");
        System.out.println("***Danh Sach Sinh Vien***");
        for(int i=0;i<3;i++)
        {
            t.sv[i].getInfo();
        }
        int dem=0;
        for(int i=0;i<3;i++)
        {
            if(t.sv[i].checkName("Tran Nghia"))
            {
                System.out.println("Ten ban tim co trong danh sach!");
                break;
            }
            else
                dem++;
        }
        if(dem==3)
            System.out.println("Ten ban tim khong co trong danh sach!");

        if(t.sv[0].checkGroup(t.sv[2].getGroup()))
            System.out.println("Hai sinh vien cung lop");
        else
            System.out.println("Hai sinh vien khac lop");

        //TODO kiem tra class Giao Vien
        t.gv[0] = new GiaoVien("Phe Do", "K62CF","CNTT");
        t.gv[1] = new GiaoVien("Hong Thinh", "K63CK","KHMT");
        t.gv[2] = new GiaoVien("Tri Thanh","K61CC","DTVT");
        System.out.println("***Danh Sach Giao Vien***");
        for(int i=0;i<3;i++)
        {
            t.gv[i].getInfo();
        }
        if(t.gv[0].getGroup().equals(t.sv[0].getGroup()))
            System.out.println("Giao vien Phe Do day sinh vien Nguyen Nhanh");
        else
            System.out.println("Giao vien Phe Do khong day sinh vien Nguyen Nhanh");

        //TODO kiem tra class  UET
        t.uet[0] = new UET("KHMT", 20,23.5);
        t.uet[1] = new UET("CNTT", 30,25.75);
        t.uet[2] = new UET("DTVT",15,20.25);
        System.out.println("***Danh Sach Khoa***");
        for(int i=0;i<3;i++)
        {
            t.uet[i].getInfo();
        }
        if(t.uet[0].checkKhoa(t.gv[0].getEmail()))
            System.out.println("Khoa KHMT co giao vien Phe Do");
        else
            System.out.println("Khoa KHMT khong co giao vien Phe Do");

    }
}

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới

//TODO: khai bao class SinhVien
class SinhVien
{
    // TODO: khai báo các thuộc tính cho SinhVien
    private
    String name, id, group;
    // TODO: khai báo các phương thức getter, setter cho SinhVien
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        this.name = n;
    }

    public String getId()
    {
        return id;
    }
    public void setId(String id)
    {
        this.id = id;
    }

    public String getGroup()
    {
        return group;
    }
    public void setGroup(String g)
    {
        this.group = g;
    }
    /*
        Constructor
    */
    SinhVien(String n, String id, String g)
    {
        this.name = n;
        this.id = id;
        this.group = g;
    }

    //TODO ham kiem tra ten SinhVien co trong danh sach khong
    public boolean checkName(String n)
    {
        if(name.equals(n))
            return true;
        else
            return false;
    }
    //TODO ham kiem tra 2 SinhVien co cung lop khong
    public boolean checkGroup(String g)
    {
        if(group.equals(g))
            return true;
        else
            return false;
    }
    //TODO ham in thong tin sinh vien
    public void getInfo()
    {
        System.out.printf("%-15s%-15s%-15s\n", name, id, group);
    }
}

//TODO khai bao class Giao Vien
class GiaoVien
{
    // TODO: khai báo các thuộc tính cho GiaoVien
    private
    String name, group, email;
    // TODO: khai báo các phương thức getter, setter cho SinhVien
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        this.name = n;
    }

    public String getEmail()
    {
        return email;
    }
    public void setEmail(String e)
    {
        this.email = e;
    }

    public String getGroup()
    {
        return group;
    }
    public void setGroup(String g)
    {
        this.group = g;
    }
    /*
        Constructor
    */
    GiaoVien(String n, String g, String e)
    {
        this.name = n;
        this.email = e;
        this.group = g;
    }

    //TODO ham kiem tra ten Giao Vien co trong danh sach khong
    public boolean checkName(String n)
    {
        if(name.equals(n))
            return true;
        else
            return false;
    }
    //TODO ham kiem tra giao vien co day sinh vien khong
    public boolean checkGroup(String g)
    {
        if(group.equals(g))
            return true;
        else
            return false;
    }
    //TODO ham in thong tin Giao Vien
    public void getInfo()
    {
        System.out.printf("%-15s%-15s%-15s\n", name, group, email);
    }
}

//TODO khai bao class UET
class UET
{
    // TODO: khai báo các thuộc tính cho UET
    private
    String khoa;
    int so_gv;
    double diem_chuan;
    // TODO: khai báo các phương thức getter, setter cho UET
    public String getKhoa()
    {
        return khoa;
    }
    public void setKhoa(String k)
    {
        this.khoa = k;
    }

    public int getSo()
    {
        return so_gv;
    }
    public void setSo(int s)
    {
        this.so_gv = s;
    }

    public double getDiem()
    {
        return diem_chuan;
    }
    public void setDiem(double d)
    {
        this.diem_chuan = d;
    }
    /*
        Constructor
    */
    UET(String n, int s, double d)
    {
        this.khoa = n;
        this.so_gv = s;
        this.diem_chuan = d;
    }

    //TODO ham kiem tra UET co khoa n khong
    public boolean checkName(String n)
    {
        if(khoa.equals(n))
            return true;
        else
            return false;
    }
    //TODO ham kiem tra khoa co giao vien x khong
    public boolean checkKhoa(String g)
    {
        if(khoa.equals(g))
            return true;
        else
            return false;
    }
    //TODO ham in thong tin cac khoa
    public void getInfo()
    {
        System.out.println(khoa+"      "+so_gv+"       "+diem_chuan);
    }
}
