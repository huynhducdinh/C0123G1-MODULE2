package access_modifier_static_method_static_property1;

import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
     Student student =new Student();
     Student st = new Student();
        System.out.println("+Trước khi thay đổi tên là : "+st.getName());
        System.out.println("+Trước khi thay đổi lớp là : "+st.getClasses());
        Scanner sc =new Scanner(System.in);
        System.out.println("nhập tên sau khi thay đổi vào đây");
        String student1=sc.nextLine();
        student.setName(student1);
        System.out.println(" nhập tên lớp sau khi thay đổi vào đây");
        String classs =sc.nextLine();
        student.setClasses(classs);
        System.out.println(student.toString(student1,classs));


    }

}
