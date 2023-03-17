package ArrayList;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.add(2, 0);
        myList.add(22, 1);
        myList.add(12, 2);
        myList.add(223, 3);
        myList.add(2232, 4);
        System.out.println("In ra mảng: "+"\n"+Arrays.toString(myList.clone()));
        myList.add("0908");
        System.out.println("Mảng thêm phần tử không có index sẽ về cuối :"+"\n"+Arrays.toString(myList.clone()));
        myList.remove(2);
        System.out.println("Xoá phần tử ở vị trí index :"+"\n"+Arrays.toString(myList.clone()));
        System.out.println("Có phần tử trong mảng trả về :"+"\n"+myList.contains(2));
        myList.clear();
        System.out.println("Xoá tất cả các phần tử trong mảng :"+"\n"+Arrays.toString(myList.clone()));
    }
}