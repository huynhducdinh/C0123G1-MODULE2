package ss7_ac_interface.resizeable;

public class Squaree extends Rectangle {

    public Squaree() {
    }

    public Squaree(String colors, boolean filled, float height, float wight) {
        super(colors, filled, height, wight);
    }

    public double acre() {
        return getWight() * getWight();
    }

    @Override
    public String toString() {
        return "Square{" +
                "wight=" + getWight() +
                ", colors='" + getColors() + '\'' + isFilled() +
                ",arc=" + acre() +
                '}';
    }

    @Override
    public void resizeableresize(double percent) {
        this.wight = (float) (this.wight + this.wight * (percent / 100));

    }
}
