package module_2_apj.molel.person;

//Số hợp đồng, mã bookingtxt, Số tiền cọc trước, Tổng số tiền thanh toán, mã khách hàng.
//  hợp đồng của khách hàng.
public class Customer extends PersonCha {
    String typeOfGuest;
    String address;



    public Customer() {
    }

    public Customer(String name, String gender, String codee, String birth, String phone, String citizen, String email, String typeOfGuest, String address) {
        super(name, gender, codee, birth, phone, citizen, email);
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    public String getTypeOfGuest() {
        return typeOfGuest;
    }

    public void setTypeOfGuest(String typeOfGuest) {
        this.typeOfGuest = typeOfGuest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "customer{" +
                " name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", codeCustomer=" + codee +
                ", birday='" + birth + '\'' +
                ", phone=" + phone +
                ", citizen=" + citizen +
                ", email='" + email + '\'' +
                ",typeOfGuest='" + typeOfGuest + '\'' +
                ", Address='" + address + '\'' +
                '}';
    }
    public String convertLine1(){
        String COMMA= ",";
        return getName()+COMMA+getGender()+COMMA+getCodee()+COMMA+ getBirth()+COMMA+ getPhone()+COMMA+ getCitizen()+COMMA+getEmail()+COMMA+ getTypeOfGuest()+COMMA+ getAddress();

    }
}
