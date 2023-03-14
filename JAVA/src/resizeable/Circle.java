package resizeable;

public class Circle extends Shape {
    float radius = 1.0f;

    public Circle() {

    }

    public Circle(String colors, boolean filled, float radius) {
        super(colors, filled);
        this.radius = radius;
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
    public void resizeableresize(double percent) {
        this.radius = (float) (this.radius + this.radius * (percent / 100));

    }
}
