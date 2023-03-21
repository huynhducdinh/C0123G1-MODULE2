package ss7_ac_interface.resizeable;

public class Main {
    public static void main(String[] args) {
        System.out.println("Trước khi thay dổi");
        Shape[] tongQuat = new Shape[3];
        tongQuat[0] = new Circle();
        tongQuat[1] = new Rectangle();
        tongQuat[2] = new Squaree();
        Shape.printTongquat(tongQuat);
        System.out.println("\n");
        System.out.println("Sau khi thay dổi");
        float a = (float) ((Math.random() * 100) + 1);
        System.out.println("Random: " + a + "%");
        for (Shape s : tongQuat) {
            s.resizeableresize(a);
        }
        Shape.printTongquat(tongQuat);
    }

}
