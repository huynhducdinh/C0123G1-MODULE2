package ss3_array;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {

        int[] arr = {10, 4, 6, 7, 8, 5, 5, 5, 6, 5, 0, 0};
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập phần tử N vào đây");
        int num = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {

                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = 0;
                i--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

