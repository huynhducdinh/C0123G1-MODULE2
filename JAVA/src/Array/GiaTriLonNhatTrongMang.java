package Array;

import java.util.Scanner;

public class GiaTriLonNhatTrongMang {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("nhập phần tử thứ " + i);
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            System.out.println("các phần tử trong mảng là :" + arr[i]);
        }
        System.out.println();
        System.out.println("phân tử nhỏ nhất trong mảng là :" + min);
    }


}
