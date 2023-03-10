
package Array;

import java.util.Scanner;

public class TinhDuongCheo {
    public static void main(String[] args) {
        System.out.println("Nhập các các giá trị vào đây");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("nhâp giá trị vào đây vào đây");
        int m = Integer.parseInt(sc.nextLine());
        float[][] arr = new float[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Nhập giá trị của :" + i + "-" + j);
                arr[i][j] = Float.parseFloat(sc.nextLine());
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("tổng đường chéo chính là :" + check(arr));
        System.out.println("tổng đường chéo phụ là :" + check1(arr));
    }

    public static float check(float[][] arr) {
        float num = 0.0f;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    num += arr[i][j];
                }
            }
        }
        return num;
    }

    public static float check1(float[][] arr) {
        float num = 0;
        float n = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j == n - i) {
                    num += arr[i][j];
                }
            }
        }
        return num;
    }
}