package module_2_apj.molel.person;

public abstract class PersonCha {
    String name;
    String gender;
    String codee;
    String birday;
    String sdt;
    String cmnd;
    String email;

    public PersonCha() {
    }

    public PersonCha(String name, String gender, String codee, String birday, String sdt, String cmnd, String email) {
        this.name = name;
        this.gender = gender;
        this.codee = codee;
        this.birday = birday;
        this.sdt = sdt;
        this.cmnd = cmnd;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCodee() {
        return codee;
    }

    public void setCodee(String codee) {
        this.codee = codee;
    }

    public String getBirday() {
        return birday;
    }

    public void setBirday(String birday) {
        this.birday = birday;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "PersonCha{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", codee=" + codee +
                ", birday='" + birday + '\'' +
                ", sdt=" + sdt +
                ", cmnd=" + cmnd +
                ", email='" + email + '\'' +
                '}';
    }
}
