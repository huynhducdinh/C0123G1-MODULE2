package bai_tap_them.molel.molel;

public class Intructor extends Peron {

    String specialize;

    public Intructor() {
    }

    public Intructor(int code, String birth, String gender, String name, String specialize) {
        super(code, birth, gender, name);
        this.specialize = specialize;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    @Override
    public String toString() {
        return "Intructor{" +
                "code='" + getCode() + '\'' +
                ", name='" + getName() + '\'' +
                ", birth='" + getBirth() + '\'' +
                ", gender='" + getGender() + '\'' +
                "specialize='" + getSpecialize() + '\'' +
                '}';
    }
}