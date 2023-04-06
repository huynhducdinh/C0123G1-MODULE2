package on_thuat_toan;

import com.sun.javafx.iio.gif.GIFImageLoaderFactory;

import java.util.*;

public class Bai_1 {
//    bài 1 tìm số nguyên tố và tính tổng
    //    public static void main(String[] args) {
//        int sum=0;
//int arr[]={1,2,3,4,5,6,7,8,9,0};
//        for (int i = 0; i < arr.length ; i++) {
//            checkNT(i);
//            sum+=i;
//            System.out.println(i);
//        }
//        System.out.println(sum);
//    }
//    public static boolean checkNT(int n){
//        if (n<2){
//            return false;
//        }
//        int check=(int)Math.sqrt(n);
//        for (int i = 2; i <check ; i++) {
//            if (n%i==0){
//                return false;
//            }
//        }
//        return true;
//    }
//    Bài 2/6 đém kí tự trong chuỗi ./ đếm số lần xuất hiện  cảu phần tử bất kì
//    public static void main(String[] args) {
////        Map<Character, Integer> map = new HashMap<>();
//        String str = "huynhducdinh";
////        checkOccurrences(str,map);
////        for (Character c:map.keySet()){
////            System.out.println("ky tu " + c + " xuat hien " + map.get(c) + " lan");
////        }
//        checkOccurrences1(str);
//    }

    public static void checkOccurrences(String str, Map<Character, Integer> map) {
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
//            HashMap containsKey() dùng để kiểm tra một Key có tồn tại trong HashMap hay không.
//            Nếu không tồn tại nó sẽ trả về false, ngược lại true.
            if (map.containsKey(c)) {
                int count = map.get(c);
                map.put(c, count + 1);
            } else {
                map.put(c, 1);
            }
        }
    }

    public static void checkOccurrences1(String str) {
        boolean checks;
        do {
            checks = false;
            System.out.println("Kiểm tra số lần xuất của 1 phần tử bất kì ");
            Scanner sc = new Scanner(System.in);
            char c = sc.next().charAt(0);
            int check = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == c) {
                    check++;
                    checks = true;
                }
            }

            System.out.println("ky tu " + c + " xuat hien " + check + " lan");
        } while (!checks);
    }

    //    dãy fibonacci
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Nhập số nguyên dương n: ");
//        int n = input.nextInt();
//        System.out.print("Dãy số Fibonacci từ 0 đến " + n + " là: ");
//        for (int i = 0; i <= n; i++) {
//            System.out.print(fibonacci(i) + " ");
//        }
//    }
//
//    public static int fibonacci(int n) {
//        if (n <= 1) {
//            return n;
//        } else {
//            return fibonacci(n - 1) + fibonacci(n - 2);
//        }
//    }
//    Kiểm tra 1 số có phải là số nguyêntoos ko bài
//    public static void main(String[] args) {
//        boolean flag=true;
//        System.out.println("Nhập 1 số kiểm tra có phải là số nguyên tố không");
//        do {
//            Scanner sc = new Scanner(System.in);
//            int num = Integer.parseInt(sc.nextLine());
//            checkNTT(num);
//        }while (flag);
//    }
//
//    public static void checkNTT(int num) {
//        int count = 0;
//            for (int i = 1; i <= num; i++) {
//                if (num % i == 0) {
//                    count += 1;
//                }
//            }
//            if (count == 2) {
//                System.out.println(num + " là số nguyên tố");
//            } else {
//                System.out.println(num + "  ko là số nguyên tố");
//            }
//    }
//    tìm tổng vị trí của index trong 1 mảng bằng 2 số nhập vào bài 5
//    public static void main(String[] args) {
//
//        System.out.print("Nhập 1 số nguyên bất kì--> ");
//        Scanner sc=new Scanner(System.in);
//        int number=Integer.parseInt(sc.nextLine());
//        checkSum(number);
//    }
//    public static void checkSum(int sum){
//        int arr[]={1,2,3,4,5,6,7,8,9,0};
//        for (int i = 0; i < arr.length ; i++) {
//            for (int j = i+1; j < arr.length ; j++) {
//                if (arr[i]+arr[j]==sum){
//                    System.out.println("Vị trí thứ i--> "+i +" và vị trí thứ j--> "+j);
//                }
//            }
//        }
//    }
//    bài 6 sắp xếp chuỗi tăng dần

//        public static void main(String[] args) {

//        String[] st={"a","a","c","b","h","a"};
//            List<String> numbers = Arrays.asList(st);
//            Collections.sort(numbers);
//            System.out.println(numbers);
//            check(st);

//        }
//sắp sếp chuỗi
//    public static void main(String[] args) {
//            String[] strArray={"a","a","c","b","h","a"};
//            for (int i = 0; i < strArray.length - 1; i++) {
//                int minIndex = i;
//                for (int j = i + 1; j < strArray.length; j++) {
//                    if (strArray[j].compareTo(strArray[minIndex]) < 0) {
//                        minIndex = j;
//                    }
//                }
//                if (minIndex != i) {
//                    String temp = strArray[i];
//                    strArray[i] = strArray[minIndex];
//                    strArray[minIndex] = temp;
//                }
//            }
//        System.out.println("sắp xếp");
//            printArray(strArray);
//        }
//        private static void printArray(String[]arr){
//        for (String s:arr){
//            System.out.print(s+" ");
//        }
//
//    dảo ngược số
//public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//
//    System.out.print("Nhập một số nguyên: ");
//    int number = scanner.nextInt();
//    int reversedNumber = 0;
//
//    while (number != 0) {
//        int digit = number % 10;
//        reversedNumber = reversedNumber * 10 + digit;
//        number /= 10;
//    }
//
//    System.out.println("Số đảo ngược của số vừa nhập là: " + reversedNumber);
//}
//    max thứ 2
//public static void main(String[] args) {
//    int []arr={1,4,6,2,7};
//    Arrays.sort(arr);
//    int n= arr.length;
//    int max2=arr[n-2];
//    System.out.println(max2);

//}
}


//}
