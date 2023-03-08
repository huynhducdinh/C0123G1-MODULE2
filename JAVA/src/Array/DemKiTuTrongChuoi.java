package Array;

import java.util.Scanner;

public class DemKiTuTrongChuoi {
    public static void main(String[] args) {
        System.out.println("nhập nhiều kí tự vào đây:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Nhập kí tự cần tìm là:");
        check(str);
    }

    public static void check(String str) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        char charr = sc.nextLine().charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (charr == str.charAt(i)) {
                count++;
            }

        }
        System.out.println("các kí tự trong đó là  là :" + count);

    }

}

