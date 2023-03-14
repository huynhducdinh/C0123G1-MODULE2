package colorable;

public class Shape implements Icolorable {
    String colors = "pink";
    boolean filled = true;

    public Shape() {
    }

    public Shape(String colors, boolean filled) {
        this.colors = colors;
        this.filled = filled;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
        this.filled = false;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "TongQuat{" +
                "colors='" + getColors() + '\'' +
                ", filled=" + isFilled() +
                '}';
    }

    @Override
    public void howToColor() {
    }
}
