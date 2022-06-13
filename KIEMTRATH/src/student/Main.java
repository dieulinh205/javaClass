package student;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương a = ");
        int a = scanner.nextInt();
        System.out.print("Nhập số nguyên dương b = ");
        int b = scanner.nextInt();

        // tính USCLN của a và b
        System.out.println("USCLN của " + a + " và " + b + " là: " + USCLN(a, b));

        // tính BSCNN của a và b
        System.out.println("BSCNN của " + a + " và " + b + " là: " + BSCNN(a, b));
        }


        public static int USCLN(int a, int b) {
            int temp1 = a;
            int temp2 = b;
            while (temp1 != temp2) {
                if (temp1 > temp2) {
                    temp1 -= temp2;
                } else {
                    temp2 -= temp1;
                }
            }
            int uscln = temp1;
            return uscln;
        }

        public static int BSCNN(int a, int b) {
            return (a * b) / USCLN(a, b);
        }


}
