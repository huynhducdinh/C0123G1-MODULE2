package colorable;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Square(2);
        shapes[1] = new Circle(3);
        for (Shape s : shapes) {
            if (s instanceof Icolorable) {
                System.out.println(s);
                ((Icolorable) s).howToColor();

            }
        }
    }

}

