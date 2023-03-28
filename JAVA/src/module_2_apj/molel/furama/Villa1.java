package module_2_apj.molel.furama;

// Villa   Diện tích hồ bơi
public   class Villa1 extends Cha1CuaFarama {
   String sHoBoi;

    public Villa1() {
    }

    public Villa1(String tieuChuanPhong, int sotang, String sHoBoi) {
        super(tieuChuanPhong, sotang);
        this.sHoBoi = sHoBoi;
    }

    public String getsHoBoi() {
        return sHoBoi;
    }

    public void setsHoBoi(String sHoBoi) {
        this.sHoBoi = sHoBoi;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "sHoBoi='" + sHoBoi + '\'' +
                ", tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", sotang=" + sotang +
                '}';
    }
}
