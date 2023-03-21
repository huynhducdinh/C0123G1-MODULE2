package ss11_stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class DaoNguocPhanTu {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            stack.push(arr[i]);
        }
        System.out.println(stack);
        for (int j = 0; j < n; j++) {
            arr[j] = stack.pop();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập các chữ  vào đây");
        String strr = scanner.nextLine();
        Stack<String> stack1 = new Stack<>();
        for (int i = 0; i < strr.length(); i++) {
            stack1.push(strr.charAt(i) + "");
        }
        System.out.println(stack1);
        for (int j = 0; j < strr.length(); j++) {
            System.out.println(stack1.pop());
        }
    }
}
