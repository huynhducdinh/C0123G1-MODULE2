package OOP;

import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return (getB() * getB()) - (4 * getA() * getC());
    }

    public double getRoot1() {
        double root = ((-getB()) + Math.sqrt(getDiscriminant())) / (2 * getA());
        return root;
    }

    public double getRoot2() {
        double root1 = ((-getB()) - Math.sqrt(getDiscriminant())) / (2 * getA());
        return root1;
    }

    public double getRoot3() {
        double root3 = -getB() / (getA() * 2);
        return root3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá trị A vào đây");
        double a = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập giá trị B vào đây");
        double b = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập giá trị C vào đây");
        double c = Double.parseDouble(sc.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println(quadraticEquation.getRoot1() + " " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println(quadraticEquation.getRoot3());
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}


