package bai_tap_them.molel.service;

import bai_tap_them.molel.molel.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentIml implements IManagement {
    static ArrayList<Student> students = new ArrayList<>();

    static {
        students.add(new Student(1, "0908", "nam", "Định", "CO123G1", 7));

    }

    static Scanner sc = new Scanner(System.in);
    static Student student=new Student();

    @Override
    public void add() {

        System.out.println("NHập mã");
        int code = Integer.parseInt(sc.nextLine());
    int count = 0;
    for (int i = 0; i < students.size(); i++) {
        if (code == students.get(i).getCode()) {
            System.out.println("mã học viên có rồi");
            return;
        } else {
            count++;
        }
    }
        System.out.println("NHập tên học viên");
        String name = sc.nextLine();
        System.out.println("NHập ngày sinh học viên");
        String birday = sc.nextLine();
        System.out.println("NHập giới tính học viên");
        String gender = sc.nextLine();
        System.out.println("NHập lớp học học viên");
        String classs = sc.nextLine();
        System.out.println("NHập nhập điểm học viên");
        double ponit = Double.parseDouble(sc.nextLine());
        Student student = new Student(code, name, birday, gender, classs, (int) ponit);
        students.add(student);
    }


    @Override
    public void update() {

    }

    @Override
    public void detele() {
        System.out.println("nhập mã cần xoá :");
        Scanner sc = new Scanner(System.in);
        int code = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getCode() == code) {
                System.out.println("Bạn có muốn xoá  Mã  " + code + " này ko  " +
                        "\n 1. Có" +
                        "\n 2. Không");
                System.out.println("Chọn chức năng");
                int choss = Integer.parseInt(sc.nextLine());
                switch (choss) {
                    case 1:
                        students.remove(students.get(i));
                        System.out.println("Bạn xoá thành công");
                        break;
                    case 2:
                        System.out.println("Bạn đã không xoá");
                }
                return;
            }
        }
        System.out.println("không tìm thấy mã học viên");
    }

    public void display() {
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
