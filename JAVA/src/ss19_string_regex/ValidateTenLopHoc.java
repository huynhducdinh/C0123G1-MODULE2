package ss19_string_regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateTenLopHoc {

    public static void main(String[] args) {
        String name = "^(C|A|P)\\d{4}(G|H|I|K|M)$";
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        do {
            System.out.println("Nhập 1 tên lớp vào đây");
            String str = sc.nextLine();
            if (str.matches(name)) {
                check = false;
            } else {
                System.out.println("Nhập laại");
            }
            System.out.println(str.matches(name));
        } while (check);
    }
}
