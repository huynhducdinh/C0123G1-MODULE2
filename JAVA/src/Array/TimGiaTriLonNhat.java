package Array;

import java.util.Arrays;
import java.util.Scanner;

public class TimGiaTriLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập độ dài của mảng 1");
        int num = Integer.parseInt(sc.nextLine());
        Scanner scc = new Scanner(System.in);
        System.out.println("nhập độ dài của mảng 2");
        int num2 = Integer.parseInt(scc.nextLine());
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[num][num2];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num2; j++) {
                System.out.println("nhập phần tử cửa :"+i+"-"+j);
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        int max =arr[0][0];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (max<arr[i][j]){
                    max=arr[i][j];
                }
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("phần tử lớn nhất trong mảng là "+max);
    }
}
