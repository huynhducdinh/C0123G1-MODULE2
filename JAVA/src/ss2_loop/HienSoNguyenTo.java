package ss2_loop;

public class HienSoNguyenTo {
    public static void main(String[] args) {
        int n = 0;

        int sum;
        while (n < 20) {

            for (int i = 2; i <1000; i++) {
                sum = 0;
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        sum++;
                    }
                }
                if (sum == 2) {
                    n++;
                    System.out.println("các số nguyên tố đâu tiên là :" + i);

                }
                if (n == 20) {
                    break;
                }

            }
        }
    }
}
