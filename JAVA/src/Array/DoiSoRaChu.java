package Array;

import java.util.Scanner;

public class DoiSoRaChu {
    public static void main(String[] args) {

        System.out.println("NhẬp Số VàO đÂy");
        Scanner sc = new Scanner(System.in);
        int num =Integer.parseInt(sc.nextLine());
        String[] donVi = {"zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] duoi20 = {"Ten","eleven", "Twelve", "Thirteen", "Fourteen", "Firteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] hangChuc= {"Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
//
        if (num >= 0 && num < 9){
            DonVi(num,donVi);
        } else if (num >= 10 && num < 20) {
            Duoi20(num,duoi20);
        } else if (num >= 20 && num < 100){
            Chuc(num,hangChuc);

//        }
        }
    }
    public static void DonVi(int num ,String []arr){
        for (int i = 0; i < arr.length ; i++) {
            if (num ==i){
                System.out.println(arr[i]);
            }
        }
    }
    public static void Duoi20(int num ,String[]arr2){
        for (int i = 0; i < arr2.length ; i++) {
            if (num ==(i+10)){
                System.out.println(arr2[i]);
            }
        }
    }
    public static void Chuc(int num ,String[]arr1){
        int a =(num %100)/10;
        for (int i = 0; i < arr1.length ; i++) {
          if (a ==i+2){
              System.out.println(arr1[i]);
          }

        }
    }
}