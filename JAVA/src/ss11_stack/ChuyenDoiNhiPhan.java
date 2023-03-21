package ss11_stack;

import java.util.Scanner;
import java.util.Stack;

public class ChuyenDoiNhiPhan {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số bạn muốn nhị phân vào đây");
        int num = Integer.parseInt(sc.nextLine());
        while (num != 0) {
            num = num / 2;
            int sum = num % 2;
            stack.push(sum);
        }
        System.out.println("giá trị nhị phân là " + stack);

    }

}
