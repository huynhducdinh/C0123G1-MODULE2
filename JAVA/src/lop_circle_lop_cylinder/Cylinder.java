package lop_circle_lop_cylinder;

public class Cylinder extends Circle {
    double height = 0.0;

    public Cylinder() {
    }

    public Cylinder(double radius, String colorr, double height) {
        super(radius, colorr);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double Volume() {
        return getAcreage() * getHeight();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", radius=" + radius +
                ", colorr='" + colorr + '\'' +
                '}';
    }
}

