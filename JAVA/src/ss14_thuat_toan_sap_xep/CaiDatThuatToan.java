package ss14_thuat_toan_sap_xep;

import java.util.Arrays;

public class CaiDatThuatToan {
    public static void main(String[] args) {
        int arr[] = {3, 1, 5, 8, 2, 9, 0};
        insertionSort(arr);
        System.out.println("mảng sau khi sắp xếp " + Arrays.toString(arr));
    }

    public static void insertionSort(int[] list) {
        int count;
        int pos;
        for (int i = 0; i < list.length; i++) {
            count = list[i];
            pos = i;
            while (0 < pos && count < list[pos - 1]) {
                list[pos] = list[pos - 1];
                pos--;
            }
            list[pos] = count;

        }
    }
}
