import java.util.Scanner;

public class bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử : ");
        int n = sc.nextInt();
        System.out.println("Nhập phần tử");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sort(arr, n);

        System.out.println("Mang sau khi sap xep:");
        for(int i = 0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }

        while(1==1){
            System.out.println("\nPhần tử cần tìm kiếm: ");
            int x = sc.nextInt();
            if(x == -1) break;
            if(binarySearch(arr,x,n)){
                System.out.println("Tìm thấy: " + x);
            }else System.out.println("Không tìm thấy: " + x);
        }
    }

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
    public static boolean binarySearch(int[] arr, int x, int n) {

        int left = 0, right = n - 1;
        while (left <= right){
            int mid = (left + right)/2;
            if(arr[mid] == x)
                return true;
            else if (arr[mid] < x)
                left = mid + 1;
            else right = mid - 1;
        }
        return false;

    }


}
