package ss2_loop;

public class HienSoNguyenTo {
//    public static void main(String[] args) {
//        int n = 0;
//
//        int sum;
//        while (n < 20) {
//
//            for (int i = 2; i <1000; i++) {
//                sum = 0;
//                for (int j = 1; j <= i; j++) {
//                    if (i % j == 0) {
//                        sum++;
//                    }
//                }
//                if (sum == 2) {
//                    n++;
//                    System.out.println("các số nguyên tố đâu tiên là :" + i);
//
//                }
//                if (n == 20) {
//                    break;
//                }
//
//            }
//        }
//    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,0};
        int sum = 0;
        for (int i = 2; i < arr.length; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("Tổng các số nguyên tố nhỏ hơn 10 là: " + sum);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int i = 2;
        while (i <= Math.sqrt(n)) {
            if (n % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
