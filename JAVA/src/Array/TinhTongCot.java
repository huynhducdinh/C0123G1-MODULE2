package Array;

import java.util.Scanner;

public class TinhTongCot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập N vào đây");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập M vào đây");
        int m = Integer.parseInt(sc.nextLine());
        float[][] arr = new float[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("nhập phần tử thứ " + i + "-" + j);
                arr[i][j] = Float.parseFloat(sc.nextLine());
            }

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
//        System.out.println(Arrays.deepToString(arr));
            }

            System.out.println(" ");
        }
        System.out.println("nhập số cột bản muốn tính tổng ");
        int right = Integer.parseInt(sc.nextLine());
        System.out.println("tổng của cột "+right+"là :" +sum(right,arr));

    }
        public static int sum(int right, float[][] arr) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (right == i) {
                        sum += arr[j][right];
                    }
                }
            }
            return sum;
        }
    }