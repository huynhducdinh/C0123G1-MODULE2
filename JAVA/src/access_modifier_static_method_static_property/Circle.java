package access_modifier_static_method_static_property;

public class Circle {
    private double radius=1.0 ;
     String color = "red";
//    private String color1;

    public Circle() {


    }

    public Circle(double radius ,String color ) {
        this.radius = radius;
        this.color =color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getAera() {
        return Math.pow(radius, 2) * 3.14;
    }

    public String display() {
        return "Diện tích hình tròn sau khi thay đổi là: "+ getAera()+"\n"+"Màu sau khi sau khi thay đổi là: "+ getColor();
    }
}
