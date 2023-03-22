package ss14_thuat_toan_sap_xep;

import java.util.Arrays;

public class MoPhongThuatToan {
    public static void main(String[] args) {
        int arr[]={8,4,9,3,2};
        System.out.println("Chuỗi chưa được sắp xếp thứ tự: "+Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Chuỗi sau khi chuyển sắp xếp thứ tự: "+Arrays.toString(arr));
    }
    public static void insertionSort(int[] array){
        int x;
        int pos;
        for (int i = 0; i < array.length ; i++) {
            x=array[i];
            pos=i;
            while (0<pos&& x<array[pos-1]){
             array[pos]=array[pos-1];
             pos--;
                System.out.println("-lần thứ : "+i+" "+Arrays.toString(array));

            }
            array[pos]=x;
            System.out.println("+sau lần thứ : "+i+" "+Arrays.toString(array));

        }
    }
}
