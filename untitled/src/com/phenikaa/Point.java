package com.phenikaa;
import  java.lang.Math;

public class Point {
    double x;
    double y;

    public Point(Point point) {
        this.x = point.x;
        this.y = point.y;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public static double distance(Point p1, Point p2) {
        double kc = Math.sqrt((p1.getX()-p2.getX())*(p1.getX()-p2.getX())+(p1.getY()-p2.getY())*(p1.getY()-p2.getY()));
        return kc;
    }

    static void lineFunction(Point p1, Point p2) {
        System.out.println((p2.getY() - p1.getY()) + " (x - " + p1.getX() + ") + " + (p2.getX() - p1.getX()) + " * (y - " + p2.getY() + ")");
    }

    static void Demo(Point p1, Point p2, Point p3) {
        double d1, d2, d3;
        d1 = distance(p1,p2);
        d2 = distance(p1,p3);
        d3 = distance(p2,p3);

        if(d1+d2==d3 || d1+d3==d2 || d2+d3==d1) {
            System.out.println("3 diem thang hang");
        } else {
            double p=d1+d2+d3;
            double v1 = (-d1 + p / 2) * (-d2 + p / 2) * (-d3 + p / 2);

            double S=Math.sqrt(p/2*v1);
            System.out.println("Dien tich : " + S);
        }
    }




}
