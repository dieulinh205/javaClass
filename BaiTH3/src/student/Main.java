package student;

public class Main {
    public static void main(String[] args) {
     //   new Bai1();
        Bank acc = new Bank(8000);
        acc.display();
        Sender s = new Sender(acc);
        student.Receiver r = new Receiver(acc);
        s.t.start();
        r.t.start();
    }
}