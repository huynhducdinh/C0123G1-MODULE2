package ss11_stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(" nhập chuỗi vào để kiểm tra xem  có phải là Palindrome  không ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        System.out.println(Check(str));
    }

    public static boolean Check(String s) {
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            queue.add(c);
            stack.push(c);
        }
        while (!queue.isEmpty()) {
            if (queue.remove() != stack.pop()) {
                return false;
            }

        }
        return true;
    }

}

