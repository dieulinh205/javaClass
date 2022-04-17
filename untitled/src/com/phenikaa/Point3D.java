package com.phenikaa;

public class Point3D extends Point {
    private double z;

    public Point3D(double x, double y,double z) {
        super(x,y);
        this.z = z;
    }

    public Point3D(Point3D point) {
        super(point);
        this.z = point.getZ();
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public static Vector PlaneEquation(Point3D a, Point3D b, Point3D c){
        Vector AB = new Vector(a,b);
        Vector BC = new Vector(b,c);

        Vector vector = Vector.VectorPhapTuyen(AB,BC);

        System.out.println(vector.getX()+"x "+ vector.getY()+"y + "+ vector.getZ()+"z");
        return AB;
    }
}
