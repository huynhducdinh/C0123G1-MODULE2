package array;

import java.util.Arrays;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập N vào đây");
        int N = Integer.parseInt(sc.nextLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.println("phần tử thứ i " + i);
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("+phần tử nhỏ nhất trong " + Arrays.toString(arr) + "là :" + min);
        System.out.println("+phần tử lớp nhất trong " + Arrays.toString(arr) + "là :" + max);
        int sum;
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = 1; j <= arr[i]; j++) {
                if (arr[i] % j == 0) {
                    sum++;
                }
            }
            if (sum == 2) {
                n++;
                System.out.println("-các số nguyên tố trong mảng là :" + arr[i]);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                   int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
            System.out.println("+tăng dần:"+arr[i] + " ");
        }
        int count =0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]%2==0){
                count++;
                System.out.println("+số phần tử chẵn là :"+ arr[i]);
            }
        }
        System.out.println("+vậy số phần tử chẵn trong mảng là :"+ count);


    }
}
