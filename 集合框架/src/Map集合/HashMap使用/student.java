package Map集合.HashMap使用;

public class student implements Comparable<student>{
    private String name;
    private int stuNo;

    public student() {
    }

    @Override
    public int compareTo(student o) {
         int n2=this.stuNo-o.getStuNo();
        return n2;
    }

    public student(String name, int stuNo) {
        this.name = name;
        this.stuNo = stuNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStuNo() {
        return stuNo;
    }

    public void setStuNo(int stuNo) {
        this.stuNo = stuNo;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", stuNo=" + stuNo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof student)) return false;

        student student = (student) o;

        if (stuNo != student.stuNo) return false;
        return name.equals(student.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + stuNo;
        return result;
    }
}
