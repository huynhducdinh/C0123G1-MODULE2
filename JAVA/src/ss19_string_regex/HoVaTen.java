package ss19_string_regex;

import java.util.Scanner;

public class HoVaTen {
    public static void main(String[] args) {
        String str1="^([A-Z][a-z]{1,}(\\s))([A-Z][a-z]{1,}(\\s))*([A-Z][a-z]{1,})$";
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập tên vào đây");
        String str= sc.nextLine();
        System.out.println(str.matches(str1));
    }
}
