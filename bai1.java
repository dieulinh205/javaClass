import java.util.Scanner;

public class bai1 {

    public static void sapxep(int[] arr, int n){
        int i, j, m, x;
        Scanner sc = new Scanner(System.in);

        for (i = 0; i < n; i++)
        {
            m = i;
            for (j = i + 1; j < n; j++)
                if (arr[j] < arr[m])
                    m = j;

            if (i == m) {
                continue;
            }
            x = arr[i];
            arr[i] = arr[m];
            arr[m] = x;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu can sap xep: ");
        int n = sc.nextInt();

        System.out.println("Nhap so phan tu cho mang: ");
        int[] arr = new int[n];
        for(int i =0;i < n; i++ ){
            arr[i] = sc.nextInt();
        }
        sapxep(arr, n);

        System.out.println("\nMang sau khi sap xep:");
        for(int i = 0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }

    }



}
