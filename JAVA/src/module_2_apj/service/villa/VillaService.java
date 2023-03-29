package module_2_apj.service.villa;

import module_2_apj.molel.furama.Villa;
import module_2_apj.repositroy.villa.VillaRepo;

import java.util.List;
import java.util.Scanner;

public class VillaService implements IVillaService {
    VillaRepo villaRepo = new VillaRepo();
    List<Villa> villa1List = villaRepo.getAllDisplay();
    static Scanner sc = new Scanner(System.in);

    @Override
    public void display() {
        for (Villa v : villa1List) {
            System.out.println(v);
        }
    }

    @Override
    public void add() {
        System.out.println("Nhập tiêu chuẩn phòng");
        String phong = sc.nextLine();
        System.out.println("Nhập số tầng ");
        int number = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập S hồ bơi");
        String hoBoi = sc.nextLine();
        Villa villa1=new Villa(phong,number,hoBoi);
        villa1List.add(villa1);
        villaRepo.add(villa1);
    }
}
