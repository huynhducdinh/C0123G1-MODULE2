package module_2_apj.molel.person;

import module_2_apj.molel.person.PersonCha;

import java.util.Comparator;

//: Mã nhân viên, Họ tên, Ngày sinh, Giới tính, Số CMND, Số Điện Thoại, Email, Trình độ, Vị trí, lương
public class Employee extends PersonCha {

    String qualification;
    String position;
   double salary;

    public Employee() {

    }

    public Employee(String name, String gender, String codee, String birday, String sdt, String cmnd, String email, String qualification, String position, double salary) {
        super(name, gender, codee, birday, sdt, cmnd, email);
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
                ", birday='" + birday + '\'' +
                ", sdt=" + sdt +
                ", cmnd=" + cmnd +
                ", email='" + email + '\'' +
                " ,qualification='" + qualification + '\'' +
                ", position='" + position + '\'' +
                ", salary='" + salary + '\'' +

                '}';
    }
public String convertLine(){
        String COMMA =",";
        return getName()+COMMA+getGender()+COMMA+getCodee()+COMMA+getBirday()+COMMA+getSdt()+COMMA+getCmnd()+COMMA+getEmail()+COMMA+getQualification()+COMMA+getPosition()+COMMA+getSalary();
}
}
