package student;

import java.util.Scanner;
import java.lang.Thread;

class Sender implements Runnable {
    Bank acc;
    Thread t;
    public Scanner scanner = new Scanner(System.in);

    Sender(Bank acc){
        this.acc = acc;
        t = new Thread(this,"Sender");
    }
    @Override
    public void run() {
        while(true){
            int tienNap = scanner.nextInt();
            acc.napTien(tienNap);
        }
    }
}
class Receiver implements Runnable{
    public Scanner scanner = new Scanner(System.in);
    Bank acc;
    int tienRut;
    Thread t;
    Receiver(Bank acc){
        this.acc = acc;
        t = new Thread(this, "Receiver");
    }
    public void run(){
        while(true){
            int tienRut = scanner.nextInt();
            acc.rutTien(tienRut);
        }
    }
}
public class BankingTest{

}