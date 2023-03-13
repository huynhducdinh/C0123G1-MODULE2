package lop_circle_lop_cylinder;

import java.util.Scanner;

public class Text {

    public static void main(String[] args) {
        Circle circle = new Circle();
        Cylinder cylinder = new Cylinder();
        System.out.println("Trước khi thay đổi của " + circle.toString());
        System.out.println("Trước khi thay đổi của " + cylinder.toString());
        Scanner sc = new Scanner(System.in);
        System.out.println("-Nhập Bán hình hình tròn vào đây");
        double bankinh = Double.parseDouble(sc.nextLine());
        cylinder.setRadius(bankinh);
        circle.setRadius(bankinh);
        System.out.println("-Nhập màu bạn muốn cho hình tròn vào đây");
        String colorr = sc.nextLine();
        cylinder.setColorr(colorr);
        circle.setColorr(colorr);
        System.out.println("-Nhập chiều cao của hình trụ");
        double height = Double.parseDouble(sc.nextLine());
        cylinder.setHeight(height);
        System.out.println(circle.toString());
        System.out.println("Diện tích hình tròn là :" + circle.getAcreage() + "\n" + "Màu hình tròn :" + circle.getColorr());
        System.out.println(cylinder.toString());
        System.out.println("Diện tích hình trụ là :" + cylinder.Volume() + "\n" + "Màu hình trụ :" + cylinder.getColorr());
    }
}
