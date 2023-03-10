package access_modifier_static_method_static_property;

import java.util.Scanner;

public class TestCircle {

    public static void main(String[] args) {
        Circle circle =new Circle();
        System.out.println("+Trước khi thay đổi "+circle.getAera());
        System.out.println("+Trước khi thay đổi màu là : "+circle.getColor());
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập bán kính  khi thay đổi vào đây");
        double banKinh =sc.nextDouble();
        System.out.println("Nhập màu  muốn thay đổi vào đây vào đây");
        String color1 =sc.next();
        Circle circle1 =new Circle(banKinh,color1);
        System.out.println(circle1.display());

    }

}
