package module_2_apj.molel.person;

public abstract class PersonCha {
    String name;
    String gender;
    String codee;
    String birth;
    String phone;
    String citizen;
    String email;

    public PersonCha() {
    }

    public PersonCha(String name, String gender, String codee, String birth, String phone, String citizen, String email) {
        this.name = name;
        this.gender = gender;
        this.codee = codee;
        this.birth = birth;
        this.phone = phone;
        this.citizen = citizen;
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

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCitizen() {
        return citizen;
    }

    public void setCitizen(String citizen) {
        this.citizen = citizen;
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
                ", birth='" + birth + '\'' +
                ", phone=" + phone +
                ", citizen=" + citizen +
                ", email='" + email + '\'' +
                '}';
    }
}
