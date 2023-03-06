import java.util.Scanner;

public class DoiTienTe {
    public static void main(String[] args) {
        double vnd =23000d;
        double usd;
        System.out.println("Mời bạn nhập số tiền USD:");
        Scanner sc =new Scanner(System.in);
        usd= sc.nextDouble();
        double quydoi= usd*vnd;
        System.out.println("Giá trị VND:"+quydoi);
    }
}
