package ss15_exception;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        int a=0,b=0,c=0;
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập 1 cạnh của tam giác");
            a = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập 1 cạnh của tam giác");
            b = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập 1 cạnh của tam giác");
             c = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("cạnh tam giác không phải là chữ");
            System.out.println(e.getMessage());
        }

        try {
            checkTriangleSide(a,b,c);
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void checkTriangleSide(int a, int b, int c) throws IllegalTriangleException {
        if (a < 0 || b < 0 || c < 0 ) {
            throw new IllegalTriangleException("-Cạnh không phải là số âm");
        } else if ( (a + b) <= c || (b + c) <= a || (a + c) <= b) {
            throw new IllegalTriangleException("-ko phải là tam giác");
        } else {
            System.out.println("là 1 tam giác");
        }
    }
}
