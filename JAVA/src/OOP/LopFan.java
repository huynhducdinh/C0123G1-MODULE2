package OOP;

import java.util.Scanner;

public class LopFan {
    int slow = 1;
    int medium = 2;
    static int fast = 3;
    int speed = 1;
    boolean on = false;
    String color = "blue";
    double radius = 5;


    public LopFan() {
    }


    public LopFan(int speed, boolean on, String color, double radius) {
        this.speed = speed;
        this.on = on;
        this.color = color;
        this.radius = radius;
    }

    public int getSlow() {
        return slow;
    }

    public void setSlow(int slow) {
        this.slow = slow;
    }

    public int getMedium() {
        return medium;
    }

    public void setMedium(int medium) {
        this.medium = medium;
    }

    public int getFast() {
        return fast;
    }

    public void setFast(int fast) {
        this.fast = fast;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString() {
        if (isOn()) {
            return "Quạt đang bật," +" "+ "Tốc độ quạt là " + getSpeed()+"," +" "+ "Bán kính quạt là :" + getRadius()+"," +" "+ "Màu sắc là :" + getColor();
        } else {
            return "Quạt đang tắt," +" "+ "Tốc độ quạt là " + getSpeed()+"," +" "+ "Bán kính quạt là :" + getRadius()+"," +" "+ "Màu sắc là :" + getColor();
        }
    }

    public static void main(String[] args) {
        LopFan fan = new LopFan();
        fan.setOn(true);
        fan.setSpeed(fast);
        fan.setRadius(10);
        fan.setColor("yello");
        LopFan fan1 = new LopFan();
        fan1.setOn(false);
        fan1.setSpeed(fast);
        fan1.setRadius(5);
        fan1.setColor("blue");

        Scanner sc =new Scanner(System.in);
        System.out.println("+bấm phím 0 để quạt chạy:");
        int bat = Integer.parseInt(sc.nextLine());
        if (bat==0){
            System.out.println(fan);
        }
        System.out.println("+Bấm phim 1 để quạt ngưng:");
        int tat = Integer.parseInt(sc.nextLine());
        if (tat==1){
            System.out.println(fan1);
        }
        }
    }


