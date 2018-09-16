package week1;


public class Student {

    // TODO: khai báo các thuộc tính cho Student

    private String name, id, group, email;


    // TODO: khai báo các phương thức getter, setter cho Student

    public String getName()
    {
        return name;
    }

    public void setName(String n)
    {
        if(n==null)
            this.name = "null";
        else
            this.name = n;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        if(id==null)
            this.id = "null";
        else
            this.id = id;
    }

    public String getGroup()
    {
        return group;
    }

    public void setGroup(String group)
    {
        if(group==null)
            this.group = "null";
        else
            this.group = group;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        if(email == null)
            this.email = "null";
        else
            this.email = email;
    }

    /**
     * Constructor 1
     */
    Student() {
        // TODO:
        this.name = "Student";
        this.id = "000";
        this.group = "INT2204 1";
        this.email = "uet@vnu.edu.vn";
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        // TODO:
        this.name = n;
        this.id = sid;
        this.group = "INT2204 1";
        this.email = em;
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {

        // TODO:
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }

    public void getInfo() {
        // TODO:

        System.out.printf("%-15s%-15s%-15s%s\n", name, id, group, email);
    }
}
