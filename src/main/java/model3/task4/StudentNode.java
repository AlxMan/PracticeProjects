package model3.task4;

import java.util.Objects;

public class StudentNode {
    int stuNo;
    String stuName;
    int stuAge;

    @Override
    public String toString() {
        return "StudentNode{" +
                "stuNo=" + stuNo +
                ", stuName='" + stuName + '\'' +
                ", stuAge=" + stuAge +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentNode that = (StudentNode) o;
        return stuNo == that.stuNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(stuNo);
    }

    public StudentNode(int stuNo, String stuName, int stuAge) {
        this.stuNo = stuNo;
        this.stuName = stuName;
        this.stuAge = stuAge;
    }

    public StudentNode() {
    }

    public int getStuNo() {
        return stuNo;
    }

    public void setStuNo(int stuNo) {
        this.stuNo = stuNo;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }
}
