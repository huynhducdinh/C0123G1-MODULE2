package ss6_ke_thua.lop.lop_circle_lop_cylinder;

public class Circle {
    double radius = 1.0;
    String colorr = "Pink";

    public Circle() {

    }

    public Circle(double radius, String colorr) {
        this.radius = radius;
        this.colorr = colorr;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColorr() {
        return colorr;
    }

    public void setColorr(String colorr) {
        this.colorr = colorr;
    }

    public double getAcreage() {
        return (getRadius() * getRadius()) * 3.14;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", colorr='" + colorr + '\'' +
                '}';
    }
}

