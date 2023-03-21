package ss2_loop;

import java.util.Scanner;

import static sun.nio.ch.IOStatus.check;

public class InRa20SNT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hãy nhập nguyên vào đây");
        int numbers = Integer.parseInt(sc.nextLine());
        int N = 2;
        int count = 0;
        while (count < numbers) {
            if (check(N)) {
                count++;
            }
            N++;
        }
    }
    public static boolean check(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt((n));
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        System.out.println("các số nguyên tố là :"+n);
        return true;
    }
}
