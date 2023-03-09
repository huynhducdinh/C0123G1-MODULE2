package Loop;


import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        boolean flag;
        do {
            flag = true;
            Scanner input = new Scanner(System.in);
            System.out.println("Menu");
            System.out.println("1. Draw the rectangle");
            System.out.println("2. Draw the square triangle");
            System.out.println("3. Draw the isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            int menu = input.nextInt();
            switch (menu) {
                case 1:
                    rectangle();
                    break;
                case 2:
                    squareTriangle();
                    break;
                case 3:
                    isoscelesTriangle();
                    break;
                default:
                    flag = false;
            }

        } while (flag);
    }

    public static void rectangle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều rộng: ");
        int wide = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập chiều dài: ");
        int length = sc.nextInt();
        for (int i = 0; i < wide; i++) {
            for (int j = 0; j < length; j++) {
                if (j == length - 1) {
                    System.out.print("*" + "\n");
                } else {
                    System.out.print("*");
                }
            }
        }
    }

    public static void squareTriangle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ cao: ");
        int wide = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < wide; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = wide; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void isoscelesTriangle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ cao: ");
        int wide = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= wide; i++) {
            for (int j = wide; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}