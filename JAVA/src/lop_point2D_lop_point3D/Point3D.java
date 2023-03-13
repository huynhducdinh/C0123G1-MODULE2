package lop_point2D_lop_point3D;

public class Point3D extends Point2D {
    float z = 1.2f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;

    }

    public float[] getXYZ() {
        float[] xyz = new float[3];
        xyz[0] = this.x;
        xyz[1] = this.y;
        xyz[2] = this.z;
        return xyz;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
