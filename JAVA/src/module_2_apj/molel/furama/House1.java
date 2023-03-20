package module_2_apj.molel.furama;

// House được kế thừ từ Facility và có thêm các chức năng khác :Tiêu chuẩn phòng, Số tầng
public class House1 extends Cha1CuaFarama {


    public House1() {
    }

    public House1(String tieuChuanPhong, int sotang) {
        super(tieuChuanPhong, sotang);
    }

    @Override
    public String toString() {
        return "House{" +
                "tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", sotang=" + sotang +
                '}';
    }
}
