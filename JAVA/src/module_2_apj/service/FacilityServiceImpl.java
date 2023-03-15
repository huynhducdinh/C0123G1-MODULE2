package module_2_apj.service;

import module_2_apj.molel.Facility;

import java.util.Scanner;

public class FacilityServiceImpl implements IFacilityService {
    static Facility[] facility = new Facility[100];

    static {
        facility[0] = new Facility("vila", "nha", "phong", "dinh", "vht", "vifla", "viela", "vieqla");
        facility[1] = new Facility("svila", "nha", "phong", "dinh", "vht", "vifla", "viela", "vieqla");
    }

    public void display() {
        for (Facility f : facility) {
            if (f != null) {
                System.out.println(f);
            }else {
                break;
            }
        }
    }

    @Override
    public void add() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập tên Villa");
        String villa =sc.nextLine();
        System.out.println("Nhập tên Nhà");
        String house =sc.nextLine();
        System.out.println("Nhập tên Phòng");
      String room =sc.nextLine();
        System.out.println("Nhập tên Tên");
      String name =sc.nextLine();
        System.out.println("Nhập tên Diện tích đất");
        String arc =sc.nextLine();
        System.out.println("Nhập tên Chi phí thuê");
        String villa1 =sc.nextLine();
        System.out.println("Nhập tên Số lượng người ở");
        String villa2 =sc.nextLine();
        System.out.println("Nhập tên chi ví");
        String villa22 =sc.nextLine();
        Facility facilityy = new Facility(villa,house,room,name,arc,villa1,villa2,villa22);
        for (int i = 0; i < facility.length ; i++) {
            if (facility[i]==null){
                facility[i]=facilityy;
                break;
            }
        }
    }
}


