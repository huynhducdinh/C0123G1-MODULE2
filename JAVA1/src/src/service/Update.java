package service;

import controller.MenuCodeGym;
import molel.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Update implements  IManagement{
    @Override
    public void update() {
//        ArrayList<Student>arrayList =new ArrayList<>();
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhập mã học viên hoặc giảng viên");
        String ma=sc.nextLine();
        System.out.println("Nhập Tên học viên hoặc giảng viên");
        String name=sc.nextLine();
        System.out.println("Nhập ngày sinh");
       String day =sc.nextLine();
        System.out.println("Nhập  giới tính");
        String gender=sc.nextLine();
        System.out.println("Nhập  lớp (đối với học viên)");
       String classs=sc.nextLine();
        System.out.println("Nhập  điểm học viên");
        String point=sc.nextLine();
        System.out.println("Nhập Chuyên môn của giáo viên");
        String specialize=sc.nextLine();
        Update update=new Update();
//        arrayList.add(student);
    }

    @Override
    public void detele() {

    }

    @Override
    public void list() {

    }
}
