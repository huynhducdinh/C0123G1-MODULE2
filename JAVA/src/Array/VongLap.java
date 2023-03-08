package Array;

import java.util.Scanner;

public class VongLap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ cao: ");
        int wide = Integer.parseInt(sc.nextLine());
        System.out.println("*");
        int sum;
        for (int i = 1; i <wide ; i++) {
            for (int j = 0; j <2*wide ; j++) {
                sum =j-wide;
                if (sum <0){
                    sum*=-1;
                }
            }
        }
    }
}
