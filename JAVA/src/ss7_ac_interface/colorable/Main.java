package ss7_ac_interface.colorable;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Square(2);
        shapes[1] = new Circle(3);
        for (Shape s : shapes) {
            if (s instanceof IColorable) {
                System.out.println(s);
                ((IColorable) s).howToColor();

            }
        }
    }

}

