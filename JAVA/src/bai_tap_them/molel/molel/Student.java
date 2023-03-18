package bai_tap_them.molel.molel;

import java.util.Objects;

public class Student extends Peron {
    private String classs;
    private double point;

    public Student() {
    }

    public Student(int code, String birth, String gender, String name, String classs, int point) {
        super(code, birth, gender, name);
        this.classs = classs;
        this.point = point;
    }

    public String getClasss() {
        return classs;
    }

    public void setClasss(String classs) {
        this.classs = classs;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" +
                "code='" + getCode() + '\'' +
                ", name='" + getName() + '\'' +
                ", birth='" + getBirth() + '\'' +
                ", gender='" + getGender() + '\'' +
                "classs='" + getClasss() + '\'' +
                ", point=" + getPoint() +
                '}';
    }
}

