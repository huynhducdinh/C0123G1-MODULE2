package s13_thuat_toan_tim_kiem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class ChuoiTangDan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String string = sc.nextLine();
        LinkedList<Character> arrayMax = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > list.getLast()) {
                    list.add(string.charAt(j));
                }
            }
            if (list.size() > arrayMax.size()) {
                arrayMax.clear();
                arrayMax.addAll(list);
            }
            list.clear();
        }
        for (Character c : arrayMax) {
            System.out.println(c);
        }
        System.out.println();
    }
}
