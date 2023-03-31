package module_2_apj.molel.furama;

public class Room extends Facility {
   String dichVuRieng;

    public Room() {

    }

    public Room(String tenDichVu, double dienTich, double chiPhiThue, int soNguoiToiDa, String kieuThue, String dichVuRieng) {
        super(tenDichVu, dienTich, chiPhiThue, soNguoiToiDa, kieuThue);
        this.dichVuRieng = dichVuRieng;
    }

    public String getDichVuRieng() {
        return dichVuRieng;
    }

    public void setDichVuRieng(String dichVuRieng) {
        this.dichVuRieng = dichVuRieng;
    }

    @Override
    public String toString() {
        return "Room{" +
                " tenDichVu='" + tenDichVu + '\'' +
                ", dienTich='" + dienTich + '\'' +
                ", chiPhiThue='" + chiPhiThue + '\'' +
                ", soNguoiToiDa='" + soNguoiToiDa + '\'' +
                ", kieuThue='" + kieuThue + '\'' +
                ",dichVuRieng='" + dichVuRieng + '\'' +
                '}';
    }
    public String convertLin5() {
        String COMMA = ",";
        return getTenDichVu() + COMMA + getDienTich() + COMMA + getChiPhiThue()+ COMMA + getSoNguoiToiDa()+ COMMA + getKieuThue()+COMMA+getDichVuRieng();
    }
}
