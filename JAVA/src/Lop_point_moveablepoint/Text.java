package Lop_point_moveablepoint;

import java.util.Scanner;

public class Text {
    public static void main(String[] args) {

        Point point = new Point();
        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.println("Trước khi thay đổi của " + point.toString());
        System.out.println("Trước khi thay đổi của " + moveablePoint.toString());
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập giá trị của X");
        float x = Float.parseFloat(sc.nextLine());
        System.out.println("nhập giá trị của Y");
        float y = Float.parseFloat(sc.nextLine());
        point.setXY(x, y);
        System.out.println("nhập giá trị của XSPEEL");
        float xspeel = Float.parseFloat(sc.nextLine());
        System.out.println("nhập giá trị của YSPEEL");
        float yspeel = Float.parseFloat(sc.nextLine());
        moveablePoint.setXY(x, y);
        moveablePoint.setSpeed(xspeel, yspeel);
        System.out.println("-Lớp Point");
        System.out.println(point.toString());
        System.out.println("-Lớp MovablePoint");
        System.out.println(moveablePoint.toString());
        System.out.println("X và Y thay đổi " + moveablePoint.move());
    }
}
