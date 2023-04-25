package bai_1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20};
        int[] array = {2, 4, 6, 8};
        int[] arr1 = {2,4,7,9};
        System.out.println( checkArray(arr));
        System.out.println( checkArray(array));
        System.out.println( checkArray(arr1));
    }

    public static boolean checkArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[i + 1] && arr[i + 2] - arr[i + 1] == arr[i + 1] - arr[i]) {
                return true;
            }
        }

        return false;
    }
}
