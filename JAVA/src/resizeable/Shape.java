package resizeable;

public abstract class Shape implements Resizeable {
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

    public static void printTongquat(Shape[] tongQuat) {
        for (Shape a : tongQuat) {
            System.out.println(a.toString());
        }
    }
}
