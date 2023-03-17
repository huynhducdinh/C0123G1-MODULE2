package bai_tap_them.molel.service;

import bai_tap_them.molel.molel.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThemMoi implements IManagement {
    static ArrayList<Student> students = new ArrayList<>();

    static {
        students.add(new Student(1, "1", "1", "1", "1", 3));

    }

    static Scanner sc = new Scanner(System.in);

    @Override
    public void add() {
        System.out.println("NHập mã");
        int ma = Integer.parseInt(sc.nextLine());
                System.out.println("NHập têm");
                String ma1 = sc.nextLine();
                System.out.println("NHập ngày sinh");
                String ma2 = sc.nextLine();
                System.out.println("NHập giớ tính");
                String ma3 = sc.nextLine();
                System.out.println("NHập lớp học");
                String ma4 = sc.nextLine();
                System.out.println("NHập nhập điểm");
                int ma5 = Integer.parseInt(sc.nextLine());
                Student student = new Student(ma, ma1, ma2, ma3, ma4, ma5);
                students.add(student);
            }
    @Override
    public void update() {

    }

    @Override
    public void detele() {
        System.out.println("nhập mã cần xoá :");
        Scanner sc = new Scanner(System.in);
       int code= Integer.parseInt(sc.nextLine());
        for (int i = 0; i <students.size() ; i++) {
            if(students.get(i).getCode()==code){
                students.remove(students.get(i));
                System.out.println("xoá thành công");
                return;
            }
        }
        System.out.println("không tìm thấy mã học viên");
//        int detele = Integer.parseInt(sc.nextLine());
//        students.remove(detele);
//        for (Student s : students) {
//
//            System.out.println(s + " ");
//        }
    }

    public void display() {
        System.out.println("Hiển thị danh sách:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
