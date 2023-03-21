package ss5_access_modifier_static_method_static_property.ss5_access_modifier_static_method_static_property1;

public class Student {
   private String name="John";
   private String classes="CO20";
   public Student(){

   }
    public Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses() {
        this.classes = classes;
    }


    public String toString ( String student1,String classes) {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }



}
