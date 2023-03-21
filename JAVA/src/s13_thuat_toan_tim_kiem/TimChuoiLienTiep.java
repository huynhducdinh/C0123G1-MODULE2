package s13_thuat_toan_tim_kiem;

import java.util.LinkedList;
import java.util.Scanner;

public class TimChuoiLienTiep {
    public static void main(String[] args) {
        LinkedList<Character> listmax = new LinkedList<>();
        LinkedList<Character> linkedList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập1 chuỗi vào đây");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (linkedList.size() > 1 && str.charAt(i) <= linkedList.getLast()) {
                linkedList.contains(str.charAt(i));
                linkedList.clear();
            }
            linkedList.add(str.charAt(i));

            if (linkedList.size() > listmax.size()) {
                listmax.clear();
                listmax.addAll(linkedList);
            }
        }
        for (Character ch : listmax) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
