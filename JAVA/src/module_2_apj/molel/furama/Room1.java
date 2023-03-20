package module_2_apj.molel.furama;

// Room được kế thừ từ Facility và có thêm các chức năng khác :bao gồm Dịch vụ miễn phí đi kèm.
public class Room1 extends Cha1CuaFarama {
    String freeService;


    public Room1() {
    }

    public Room1(String tieuChuanPhong, int sotang, String freeService) {
        super(tieuChuanPhong, sotang);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room1{" +
                "freeService='" + freeService + '\'' +
                ", tieuChuanPhong='" + tieuChuanPhong + '\'' +
                '}';
    }
}
