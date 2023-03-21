package ss11_stack;

import java.util.Scanner;
import java.util.Stack;

public class KiemTraDauNgoac {
    public  static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập 1 chuỗi kiểm tra có dấu ngoặc hay không");
        String str=sc.nextLine();
        System.out.println(checkBracket(str));
    }
    public static boolean checkBracket(String str){
        Stack<Character> stack = new Stack<>();
        char[] arr = str.toCharArray();
        for (char c: arr) {
            if (c == '('){
                stack.push(c);
            }else if (c == ')'){
                if (stack.isEmpty()){
                    return false;
                }
                char last = stack.peek();
                if ((c == '(' && last == ')')){
                    stack.pop();
                }else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
