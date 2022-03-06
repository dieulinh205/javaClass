package com.phenikaa;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args ) throws FileNotFoundException {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap n: ");
        n=sc.nextInt();
        System.out.println("Tong cua "+n+" so dau tien trong day fibonacci la: "+ sum(n));

        bai2();
    }

    public static int sum(int n)
    {
        if (n <= 0)
            return 0;
        int fibo[]=new int[n+1];
        fibo[0] = 0; fibo[1] = 1;
        int sum = fibo[0] + fibo[1];
        for (int i=2; i<=n; i++)
        {
            fibo[i] = fibo[i-1]+fibo[i-2];
            sum += fibo[i];
        }

        return sum;
    }

    public static void bai2() throws FileNotFoundException {
        int m = 0,n=0;
        int matrixA[][] = new int[0][];
        int matrixB[][] = new int[0][];
        Scanner input = new Scanner(new File("./input"));
        m=input.nextInt();
        n=input.nextInt();
        matrixA=new int[m][n];
        matrixB=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrixA[i][j]=input.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrixB[i][j]=input.nextInt();
            }
        }


        System.out.println("---------------MENU----------------\n" +
                "1.Hiển thị ma trận\n" +
                "2.tính tổng hai ma trận\n" +
                "3.tính tích hai ma trận\n" +
                "4.EXIT\n");
        Scanner sc = new Scanner(System.in);
        int op=0;
        while(op!=5){
            op = sc.nextInt();
            switch (op){
                case 1:
                {
                    matrix.PrintMatrix(matrixA,matrixB,m,n);
                    break;
                }
                case 2:
                {
                    matrix.MatrixAddition(matrixA,matrixB,m,n);
                    break;
                }
                case 3:
                {
                    matrix.MatrixMultiply(matrixA,matrixB,m,n);
                    break;
                }
                case 4:
                    return;
                default:
                {
                    System.out.println("Mời bạn nhập lại !");
                    op= sc.nextInt();
                    break;
                }

            }
        }
    }


}
