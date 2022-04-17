package com.phenikaa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập số lượng phần tử : ");
//        int n = sc.nextInt();
//        System.out.println("Nhập phần tử");
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        Bai1.sort(arr, n);

//        System.out.println("Mang sau khi sap xep:");
//        for(int i = 0; i<n; i++) {
//            System.out.print(arr[i] + " ");
//        }
//
//        double sum = 0;
//        for(int i = 0; i < n; i++) {
//            sum = sum + arr[i];
//        }
//
//        double agv = sum/n;
//
//        System.out.print("\nAgv = " + agv );



        Point p1 = new Point(1,3);
        Point p2 = new Point(3, 5);
        Point p3 = new Point(5, 4);

        Point.lineFunction(p1,p2);
        Point.Demo(p1, p2, p3);

        Point3D a = new Point3D(-1,2,1);
        Point3D b = new Point3D(3,1,4);
        Point3D c = new Point3D(4,1,5);

        Vector vector = Point3D.PlaneEquation(a,b,c);





    }

}
