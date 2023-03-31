package module_2_apj.service.contract;

import module_2_apj.molel.bookingorcontract.Contract;
import module_2_apj.repositroy.contract.ContractRepo;
import module_2_apj.repositroy.contract.IContract;

import java.util.List;
import java.util.Scanner;

public class ContractServiceIml implements module_2_apj.service.contract.IContract {
    static IContract hopDongThueRepo = new ContractRepo();
    List<Contract> hopDongThue3List = hopDongThueRepo.getAllDisplay();
    static Scanner sc = new Scanner(System.in);

    @Override
    public void display() {
        for (Contract h : hopDongThue3List) {
            System.out.println(h);
        }
    }

    @Override
    public void add() {
        System.out.println("Nhập số hợp đồng");
        String num = sc.nextLine();
        System.out.println("Nhập mã Booking");
        String id = sc.nextLine();
        System.out.println("Nhập mã Khách hàng");
        String code = sc.nextLine();
        System.out.println("Nhập tổng tiền thuê");
        String sum = sc.nextLine();
        System.out.println("Nhập tiền trả trước");
        String sum1 = sc.nextLine();
        Contract hopDongThue3 = new Contract(num, id, code, sum, sum1);
        hopDongThue3List.add(hopDongThue3);
        hopDongThueRepo.add(hopDongThue3);

    }

    @Override
    public void update() {
        System.out.println("Nhập mã số hợp đồng cần sửa");
        String codee = sc.nextLine();
        for (Contract h : hopDongThue3List) {
            if (h.getSoHopDong().equals(codee)) {
                System.out.println("Nhập số hợp đồng mới");
                h.setSoHopDong(sc.nextLine());
                System.out.println("Nhập mã Booking mới");
                h.setMaBooking(sc.nextLine());
                System.out.println("Nhập mã Khách hàng mới");
                h.setMaKhachHang(sc.nextLine());
                System.out.println("Nhập tổng tiền thuê mới");
                h.setTongTien(sc.nextLine());
                System.out.println("Nhập tiền trả trước mới");
                h.setTienDatCoc(sc.nextLine());
                hopDongThueRepo.update(h);
                break;
            }
        }
    }
}
