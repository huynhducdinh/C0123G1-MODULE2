package s13_thuat_toan_tim_kiem;

import java.util.Arrays;
import java.util.Scanner;

public class CaiDatThuatToanTimKiem {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("nhập đội dài của mảng");
        int size = Integer.parseInt(sc.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("nhập phần tử thứ i " + i);
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        Arrays.sort(arr);
        System.out.println("\nĐã sắp xếp ");
        for (int num : arr) {
            System.out.print(num + " ");

        }
        System.out.println("\nChọn phần tử bạn muốn tìm");
        int choss = Integer.parseInt(sc.nextLine());
        System.out.println("\nvị trí index là :");

        System.out.println(binarySearch(arr, 0, arr.length - 1, choss));
    }

    public static int binarySearch(int[] array, int left, int right, int value) {
        int middle = (left + right) / 2;
        if (array[middle] == value) {
            return middle;
        } else if (value > array[middle]) {
            left = middle + 1;
        } else {
            right = middle - 1;
        }
        if (left >= right) {
            return binarySearch(array, left, right, value);
        }
        return -1;
    }

}
