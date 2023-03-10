package Array;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập các giá trị vào đây");
        int a = Integer.parseInt(sc.nextLine());
        int[] arr = new int[a];
        System.out.println("nhập các giá trị tiếp theo vào đây theo vao đây");
        int b = Integer.parseInt(sc.nextLine());
        int[] arr1 = new int[b];
        for (int i = 0; i < a; i++) {
            System.out.println("nhập giá trị của " + i);
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        for (int j = 0; j < b; j++) {
            System.out.println("nhập giá trị của " + j);
            arr1[j] = Integer.parseInt(sc.nextLine());
        }
        int[] arr3 = new int[arr.length + arr1.length];
        int sum = 0;
        for (int ara : arr) {
            arr3[sum] = ara;
            sum++;
        }
        for (int ar : arr1) {
            arr3[sum] = ar;
            sum++;
        }
        System.out.println(Arrays.toString(arr3));
    }
}
