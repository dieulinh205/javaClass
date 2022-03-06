package com.phenikaa;
import java.util.Scanner;

public class Main {

    public static void sort( int[] arr, int n){
        for(int i = 0; i < n; i++){
            for(int j = n - 1; j > i; j--){
                if(arr[j] < arr[j-1]){
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu can sap xep: ");
        int n = sc.nextInt();

        System.out.println("Nhap so phan tu cho mang: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sort(arr, n);

        System.out.println("\nMang sau khi sap xep:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
