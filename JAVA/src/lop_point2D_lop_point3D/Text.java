package lop_point2D_lop_point3D;

import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        Point3D point3D = new Point3D();
        System.out.println("Trước khi thay đổi của " + point2D.toString());
        System.out.println("Trước khi thay đổi của " + point3D.toString());
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá trị x");
        float x = Float.parseFloat(sc.nextLine());
        System.out.println("Nhập giá trị y");
        float y = Float.parseFloat(sc.nextLine());
        point2D.setXY(x, y);
        System.out.println("Nhập giá trị z");
        float z = Float.parseFloat(sc.nextLine());
        point3D.setXYZ(x, y, z);
        System.out.println("-Lớp Point2D");
        System.out.println(point2D.toString());
        System.out.println("-Lớp Point3D");
        System.out.println(point3D.toString());
    }
}
