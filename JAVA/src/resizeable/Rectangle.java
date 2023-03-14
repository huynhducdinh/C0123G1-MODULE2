package resizeable;

public class Rectangle extends Shape {
    float height = 2.0f;
    float wight = 1.0f;


    public Rectangle() {

    }

    public Rectangle(String colors, boolean filled, float height, float wight) {
        super(colors, filled);
        this.height = height;
        this.wight = wight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWight() {
        return wight;
    }

    public void setWight(float wight) {
        this.wight = wight;
    }

    public double acr() {
        return getHeight() * getWight();
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + getHeight() +
                ", wight=" + getWight() +
                ", colors='" + getColors() + '\'' + isFilled() +
                ",acr=" + acr() +
                '}';
    }

    @Override
    public void resizeableresize(double percent) {
        this.wight = (float) (this.wight + this.wight * (percent / 100));
        this.height = (float) (this.height + this.height * (percent / 100));
    }
}
