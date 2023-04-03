package module_2_apj.molel.person;

//: Mã nhân viên, Họ tên, Ngày sinh, Giới tính, Số CMND, Số Điện Thoại, Email, Trình độ, Vị trí, lương
public class Employee extends PersonCha {

    String qualification;
    String position;
   double salary;

    public Employee() {

    }

    public Employee(String name, String gender, String codee, String birth, String phone, String citizen, String email, String qualification, String position, double salary) {
        super(name, gender, codee, birth, phone, citizen, email);
        this.qualification = qualification;
        this.position = position;
        this.salary = salary;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "employee{" +
                "  name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", codee=" + codee +
                ", birth='" + birth + '\'' +
                ", phone=" + phone +
                ", citizen=" + citizen +
                ", email='" + email + '\'' +
                " ,qualification='" + qualification + '\'' +
                ", position='" + position + '\'' +
                ", salary='" + salary + '\'' +

                '}';
    }
public String convertLine(){
        String COMMA =",";
        return getName()+COMMA+getGender()+COMMA+getCodee()+COMMA+ getBirth()+COMMA+ getPhone()+COMMA+ getCitizen()+COMMA+getEmail()+COMMA+getQualification()+COMMA+getPosition()+COMMA+getSalary();
}
}
