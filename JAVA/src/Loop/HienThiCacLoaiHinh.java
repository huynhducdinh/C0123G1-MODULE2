package Loop;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời chiều dài hình chữ nhật vào đây");
        int chieuDai = Integer.parseInt(sc.nextLine());
        Scanner scc = new Scanner(System.in);
        System.out.println("Mời nhập chiều rộng hình chữ nhật vào đâyy");
        int chieuCao = Integer.parseInt(scc.nextLine());
        for (int i = 0; i < chieuCao; i++) {
            for (int j = 0; j < chieuDai; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập chiều dài cảu tam giác");
        int length =Integer.parseInt(scanner.nextLine());
        for (int i = length; i >=1 ; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
            
        }
    }
}
