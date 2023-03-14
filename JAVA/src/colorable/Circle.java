package colorable;

public class Circle extends Shape {
    float radius = 1.0f;

    public Circle(float radius) {
        this.radius = radius;
    }

    public Circle(String colors, boolean filled) {
        super(colors, filled);

    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public double acreage() {
        return Math.pow(getRadius(), 2) * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + getRadius() +
                ", colors='" + getColors() + '\'' + isFilled() +
                ", acr='" + acreage() +
                '}';
    }

    @Override
    public void howToColor() {
        System.out.println("hình tròn: tô hết ");

    }
}
