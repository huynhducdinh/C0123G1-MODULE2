package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuTrongMang {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 6, 8, 0, 0};
        Scanner sc = new Scanner(System.in);
        System.out.println("[1, 3, 5, 2, 6, 8, 0, 0]");
        System.out.println("nhập phần tử mà bạn cầm muốn chèn vào");
        int num = Integer.parseInt(sc.nextLine());
        Scanner scc = new Scanner(System.in);
        System.out.println("nhập vị trí  index bạn muốn chèn vào đây");
        int index = Integer.parseInt(scc.nextLine());
        if (index <= -1 || index >= arr.length - 1) {
            System.out.println("không thể chèn được phần tử vào trong mảng");
        } else {
            for (int i = 0; i < arr.length; i++) {
                for (int j = arr.length - 1; j > i; j--) {
                    if (index == i) {
                        arr[j] = arr[j - 1];
                    }
                }
            }
            arr[index] = num;
            System.out.println(Arrays.toString(arr));
        }
    }
}
