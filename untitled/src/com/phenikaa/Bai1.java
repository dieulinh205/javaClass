package com.phenikaa;

import java.util.Scanner;

public class Bai1 {

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





}
