import java.util.Scanner;

public class bai_tap_them1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.printf("%50s","-----QUẢN LÝ HỌC VIÊN -----\n");
        System.out.println("Trung tâm đào đào tạo gồm có " +
                "\n1. Thêm mới học viên" +
                "\n2. Xoá học viên" +
                "\n3. Xem danh sách học viên");
        System.out.println("Mời bạn chọn chức năng");
        int select = Integer.parseInt(sc.nextLine());
        System.out.printf("%50s","--------Danh sách học viên--------\n");
        System.out.printf("+------+--------------------+--------------------+-------------+\n");
        System.out.printf("|%6s|%20s|%20s|%15s","Id","Tên","Giới Tính","Lớp|\n");
        System.out.printf("+------+--------------------+--------------------+-------------+\n");
        System.out.printf("|%6s|%20s|%20s|%15s","1","Định","Nam","C0123G1|\n");
        System.out.printf("|%6s|%20s|%20s|%15s","2","Viễn","Nam","C0123G1|\n");
        System.out.printf("|%6s|%20s|%20s|%15s","3","Khang","Nam","C0123G1|\n");
        System.out.printf("|%6s|%20s|%20s|%15s","4","Thắng","Nam","C0123G1|\n");
        System.out.printf("|%6s|%20s|%20s|%15s","5","Nhân","Nam","C0123G1|\n");
        System.out.printf("+------+--------------------+--------------------+-------------+\n");

    }
}
