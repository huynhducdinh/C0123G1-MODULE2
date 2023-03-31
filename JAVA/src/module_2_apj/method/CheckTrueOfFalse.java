package module_2_apj.method;

import module_2_apj.util.regex.Regex;

import java.util.Scanner;

public class CheckTrueOfFalse {
    static Scanner sc = new Scanner(System.in);
    static boolean check;

    public static String checkName() {

        System.out.println("Nhập tên (vd Huynh Duc Dinh) ");
        String namee;
        do {
            check = false;
            namee = sc.nextLine();
            if (Regex.checkName(namee)) {
            } else {
                System.out.println("Hi Hi Nhập lại");
                check = true;
            }
        } while (check);
        return namee;
    }

    public static String checkBrith() {
        String brith;
        System.out.println("Nhập ngày sinh (vd 09-08-2002 //09/08/2002 ");
        do {
            check = false;
            brith = sc.nextLine();
            if (Regex.checkBirth(brith)) {
            } else {
                System.out.println("Hi Hi Nhập đúng định dang xx-/xx-/xxxx");
                check = true;
            }
        } while (check);
        return brith;

    }

    public static String checkNumberPhone() {
        String isnumber;
        do {
            check = false;
            System.out.println("Nhập số điện thoại (vd 0379754891)");

            isnumber = sc.nextLine();
            if (Regex.checkPhoneNumber(isnumber)) {
            } else {
                System.out.println("Hi Hi nhap sdt");
                check = true;
            }
        } while (check);
        return isnumber;
    }

    public static String checkCitizen() {
        String citizen;
        do {
            check = false;
            System.out.println("Nhập CMND/CCCD (vd 206379735) ");
            citizen = sc.nextLine();
            if (Regex.checkCmnd(citizen)) {
            } else {
                System.out.println("Hi Hi Nhập lại CCCD/CMND có 9/12 số");
                check = true;
            }
        } while (check);
        return citizen;
    }

    public static String checkEmail() {
        String email;
        do {
            check = false;
            System.out.println("Nhập Email (vd heeyeon098@gmail.com");
            email = sc.nextLine();
            if (Regex.checkEmail(email)) {
            } else {
                System.out.println("Hi Hi Định dạng sai email xxx12@xxx.xxx");
                check = true;
            }
        } while (check);
        return email;
    }

    public static double checkWage() {
        double wage;
        do {
            check = false;
            System.out.println("Nhập tiền lương của nhân viên");
            wage = sc.nextDouble();
            if (wage > 0) {
            } else {
                System.out.println("Tiền lương ko phải là số âm");
                check = true;
            }
        } while (check);
        return wage;
    }

    public static String inputId() {
        String id;
        do {
            check = false;
            System.out.println("nhập mã (vd MV-01)");
            id = sc.nextLine();
            if (Regex.checkId(id)) {
            } else {
                System.out.println("Hi Hi hãy nhập đúng mã định dạng MV-xxx");
                check = true;
            }
        } while (check);
        return id;
    }
    public static String checkAddress() {
        String address;
        do {
            check = false;
            System.out.println("nhập địa chỉ (vd Quang Nam)");
            address = sc.nextLine();
            if (Regex.checkId(address)) {
            } else {
                System.out.println("Hi Hi  hãy nhập đúng địa chỉ ");
                check = true;
            }
        } while (check);
        return address;
    }
    public static String checkRentalType() {
        String rentalType;
        do {
            check = false;
            System.out.println("Nhập kiểu thuê theo năm, tháng, ngày, giờ.(vd 12/02/2023-15h:30)");
            rentalType = sc.nextLine();
            if (Regex.checkLease(rentalType)) {
            } else {
                System.out.println("Hi Hi sai rồi nhập lại đúng dạng (vd:12/12/2023-15h:30");
                check = true;
            }
        } while (check);
        return rentalType;
    }
    public static String checkAddresse() {
        String address;
        do {
            check = false;
            System.out.println("Nhập điịa chỉ (vd Quang Nam");
            address = sc.nextLine();
            if (Regex.checkAddress(address)) {
            } else {
                System.out.println("Hi Hi sai rồi nhập lại đúng dạng");
                check = true;
            }
        } while (check);
        return address;
    }

    public static String level() {
        System.out.println("Chọn trình độ của bạn" + "\n1.Trung Cấp" + "\n2.Cao Đẳng" + "\n3.Đại Học" + "\n4.Sau Đại Học");
        System.out.println("Nhập Trình độ nhân viên");
        String trinhDo = sc.nextLine();
        switch (trinhDo) {
            case "1":
                return "Trung cấp";
            case "2":
                return "Cao đẳng";
            case "3":
                return "Đại học";
            case "4":
                return "Sau đại học";
        }

        return trinhDo;
    }

    public static String location() {
        System.out.println("Chọn Công việc vủa bạn" + "\n1.Lễ tân" + "\n2.phục vụ" + "\n3.chuyên viên" + "\n4.giám sát" + "\n5.quản lý" + "\n6.giám đốc");
        System.out.println("Chọn công việc bạn làm tại Furama");
        String pos = sc.nextLine();
        switch (pos) {
            case "1":
                return "Lễ Tân";
            case "2":
                return "Phục Vụ";
            case "3":
                return "Chuyên Viên";
            case "4":
                return "Giám Sát";
            case "5":
                return "Quản Lí";
            case "6":
                return "Giám Đốc";
        }
        return pos;
    }

    public static String checkGender() {
        System.out.println("Chọn giới tính của bạn" + "\n1. Nam" + "\n2. Nữ" + "\n3.Khác");
        System.out.println("Hãy chọn giới tính");
        String choss = sc.nextLine();
        switch (choss) {
            case "1":
                return "Nam";
            case "2":
                return "Nữ";
            case "3":
                return "Khác";
        }
        return choss;
    }

    public static double checkAcreage() {
        double acreage;
        do {
            check = false;
            System.out.println("Diện tích vào đây (Sử dụng đất / hồ bơi");
            acreage = sc.nextDouble();
            if (acreage >= 30) {
            } else {
                System.out.println("Hi Hi nhỏ rồi nhập lại");
                check = true;
            }
        } while (check);
        return acreage;
    }
    public static double checkExpense() {
        double expense ;
        do {
            check = false;
            System.out.println("Nhập chi phí thuê ");
           expense = sc.nextDouble();
            if (expense >0) {
            } else {
                System.out.println("Hi Hi chi phí thuê ko dc là số âm");
                check = true;
            }
        } while (check);
        return expense;
    }
    public static int checkPeople() {
        int people ;
        do {
            check = false;
            System.out.println("Nhập số lượng người đi du lịch ");
            people = Integer.parseInt(sc.nextLine());
            if (people >0&&people<20) {
            } else {
                System.out.println("Hi Hi số lượng người đi du lịch <0>20");
                check = true;
            }
        } while (check);
        return people;
    }
    public static int checkNumberOfFloors() {
        int number ;
        do {
            check = false;
            System.out.println("Nhập số tầng  ");
            number = Integer.parseInt(sc.nextLine());
            if (number >0) {
            } else {
                System.out.println("Hi Hi số tầng không có tầng âm");
                check = true;
            }
        } while (check);
        return number;
    }

    public static String checkStandard() {
        System.out.println("Chọn Tiêu chuẩn phòng của bạn" + "\n1. Phòng Vip" + "\n2. Phòng Vip" + "\n3.Phòng có Giường Đơn"+"\n4.Phòng Giường Đôi");
        System.out.println("Hãy chọn Tiểu chuẩn phòng");
        String choss = sc.nextLine();
        switch (choss) {
            case "1":
                return "Phòng Vip";
            case "2":
                return "Phòng Thường";
            case "3":
                return "Phòng có Giường Đơn";
            case "4":
                return "Phòng có Giường Đôi";
        }
        return choss;
    }
    public static String rank() {
        System.out.println("Chọn loại khách " +
                "\n 1.Kim Cương" +
                "\n 2.Bạch Kim" +
                "\n 3.Vàng" +
                "\n 4.Bạc" +
                "\n 5.Thành viên");
        System.out.println("Mời bạn chọn");
        String poss = sc.nextLine();
        switch (poss) {
            case "1":
                return "Kim cương";
            case "2":
                return "Bạch kim";
            case "3":
                return "Vàng";
            case "4":
                return "Bạc";
            case "5":
                return "Thành viên";
        }
        return poss;
    }

    public static void main(String[] args) {
        CheckTrueOfFalse.checkPeople();
    }
}
