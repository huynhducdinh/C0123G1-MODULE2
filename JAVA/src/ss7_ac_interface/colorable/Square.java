package ss7_ac_interface.colorable;

public class Square extends Shape {
    float wight = 1.0f;

    public Square(float wight) {
        this.wight = wight;
        this.colors = colors;
    }

    public Square(String colors, boolean filled) {
        super(colors, filled);

    }

    public float getWight() {
        return wight;
    }

    public void setWight(float wight) {
        this.wight = wight;
    }

    public float arce() {
        return getWight() * getWight();
    }

    @Override
    public String toString() {
        return "Square{" +
                "wight=" + getWight() +
                ", colors='" + getColors() + '\'' +
                ", filled=" + (isFilled() ? "true" : "false") + '\'' +
                ",Arce=" + arce() +
                '}';
    }

    @Override
    public void howToColor() {
        System.out.println("hình vuông: tô 4 cạnh");
    }
}
