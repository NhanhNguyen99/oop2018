package week1;

public class StudentManagement {

        // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    Student[] students = new Student[100];

    public boolean sameGroup(Student s1, Student s2) {
        if(s1.getGroup()==null || s2.getGroup()==null)
            return false;
        else if(s1.getGroup().equals(s2.getGroup()))
            return true;
        else
            return false;
    }

    void studentsByGroup() {
        String[] group = new String[100];
        int i=0,k=0,j;
        boolean exist = false;
        while(students[i] != null)
        {
            j=0;
            while(j<k)
            {
                if(students[i].getGroup().equals(group[j]))
                {
                    exist = true;
                    break;
                }
                j++;
            }
            if(!exist)
            {
                group[k] = students[i].getGroup();
                k++;
            }
            exist = false;
            i++;
        }
        int n=i, m=k;
        for(int l=0;l<m;l++)
        {
            if(group[l].equals("null"))
                System.out.println("Danh sach sinh vien khong co lop:\nHo Ten\t\t\tMSV\t\t\t    Lop\t\t\t  Email");
            else if(group[l].equals("*"))
                System.out.println("");
            else
                System.out.println("Danh sach lop " + group[l] +":\nHo Ten\t\t\tMSV\t\t\t    Lop\t\t\t  Email");
            for(int p=0;p<n;p++)
            {
                if(students[p].getGroup().equals(group[l]) && !students[p].getGroup().equals("*"))
                    students[p].getInfo();
            }
            System.out.println("\n");
        }
    }
    void removeStudent(String id) {
        // TODO:
        int i=0;
        while(students[i]!=null)
        {
            if(students[i].getId().equals(id))
            {
                students[i].setGroup("*");
            }
            i++;
        }
    }

    public static void main(String[] args) {

        // TODO:

        StudentManagement st = new StudentManagement();
        st.students[0] = new Student();
        st.students[1] = new Student("Nhanh Cute", "17020942", "nnn99@gmail.com");
        st.students[2] = new Student(st.students[0]);
        st.students[2].setName("Ly May");
        st.students[2].setId("17020999");
        st.students[2].setGroup(null);
        st.students[3] = new Student("Nghia Che", "17020928", "tdn@gmail.com");
        st.students[4] = new Student("Nhim Marimo","17020910", "nm@gmail.com");
        st.students[0].setGroup("INT2204 2");
        System.out.println("*** Cau 6 ***:");
        System.out.println("Ten toi la: " + st.students[1].getName());
        System.out.println("Thong tin cua toi la: ");
        st.students[1].getInfo();
        System.out.println("*** Cau 10 ***:");
        System.out.println("Sinh vien 0 va sinh vien 1:");
        if(st.sameGroup(st.students[0], st.students[1]))
            System.out.println("Hai sinh vien hoc cung lop");
        else
            System.out.println("Hai sinh vien hoc khac lop");
        System.out.println("*** Cau 12 ***");
        System.out.println("----Danh sach sinh vien theo tung lop---- ");
        st.studentsByGroup();
        System.out.println("*** Cau 13 ***");
        System.out.println("----Danh sach sinh vien sau khi xoa---- ");
        st.removeStudent("17020910");
        st.studentsByGroup();

    }
}
