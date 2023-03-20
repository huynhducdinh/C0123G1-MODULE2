package module_2_apj.molel.furama;

public abstract class Cha1CuaFarama {
    String tieuChuanPhong;
    int sotang;

    public Cha1CuaFarama() {
    }

    public Cha1CuaFarama(String tieuChuanPhong, int sotang) {
        this.tieuChuanPhong = tieuChuanPhong;
        this.sotang = sotang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public int getSotang() {
       return sotang;
    }

    public void setSotang(int sotang) {
        this.sotang = sotang;
    }

    @Override
    public String toString() {
        return "Cha1CuaFarama{" +
                "tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", sotang=" + sotang +
                '}';
    }
}
