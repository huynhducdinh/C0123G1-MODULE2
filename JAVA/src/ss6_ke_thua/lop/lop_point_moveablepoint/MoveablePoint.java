package ss6_ke_thua.lop.lop_point_moveablepoint;

public class MoveablePoint extends Point {
    float xSpeed = 0.0f;
    float ySpeed = 0.0f;


    public MoveablePoint() {
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] speed = new float[2];
        speed[0] = xSpeed;
        speed[1] = ySpeed;
        return speed;
    }

    public MoveablePoint move() {
        x += xSpeed;
        y += ySpeed;
        return this;
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                " x=" + x +
                ", y=" + y +
                ",xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +

                '}';
    }
}
