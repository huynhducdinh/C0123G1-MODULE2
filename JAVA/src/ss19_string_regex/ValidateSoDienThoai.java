package ss19_string_regex;

import java.util.Scanner;

public class ValidateSoDienThoai {
    public static void main(String[] args) {
        String number = "^((84)|0)[0-9]{9}$";
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        do {
            System.out.println("Nhập 1 số điện thoại vào đây");
            String str = sc.nextLine();
            if (str.matches(number)) {
                check = false;
            } else {
                System.out.println("Nhập laại");
            }
            System.out.println(str.matches(number));
        } while (check);

    }
}
