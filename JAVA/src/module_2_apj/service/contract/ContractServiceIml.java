package module_2_apj.service.contract;

import module_2_apj.molel.bookingorcontract.Contract;
import module_2_apj.repositroy.contract.ContractRepo;
import module_2_apj.repositroy.contract.IContract;

import java.util.List;
import java.util.Scanner;

public class ContractServiceIml implements module_2_apj.service.contract.IContract {
    static IContract contractRepo = new ContractRepo();
    List<Contract> contractList = contractRepo.getAllDisplay();
    static Scanner sc = new Scanner(System.in);
    @Override

    public void display() {
        for (Contract h : contractList) {
            System.out.println(h);
        }
    }

    @Override
    public void add() {
        System.out.print("Enter contract number");
        String num = sc.nextLine();
        System.out.print("Enter Booking Code");
        String id = sc.nextLine();
        System.out.print("Enter Customer Code");
        String code = sc.nextLine();
        System.out.print("Enter total rent");
        String sum = sc.nextLine();
        System.out.print("Enter prepayment");
        String sum1 = sc.nextLine();
        Contract contract = new Contract(num, id, code, sum, sum1);
        contractList.add(contract);
        contractRepo.add(contract);

    }
    @Override
    public void update() {
        System.out.print("Enter the contract number to edit");
        String codee = sc.nextLine();
        for (Contract h : contractList) {
            if (h.getSoHopDong().equals(codee)) {
                System.out.print("Enter new contract number");
                h.setSoHopDong(sc.nextLine());
                System.out.print("Enter a new Booking code");
                h.setCodeBooking(sc.nextLine());
                System.out.print("Enter New Customer Code");
                h.setMaKhachHang(sc.nextLine());
                System.out.print("Enter new total rent");
                h.setSumMoney(sc.nextLine());
                System.out.print("Enter new prepayment");
                h.setTienDatCoc(sc.nextLine());
                contractRepo.update(h);
                break;
            }
        }
    }
}
