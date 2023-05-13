import bank.Payment;
import bank.Transfer;

public class Main {

    public static void main(String[] args) {
        // Test Payment class
        Payment payment1 = new Payment("2023-05-12",100.0,"Salary");
        Payment payment2 = new Payment("2023-05-13",50.0,"Bonus",2.0,1.0);
        Payment payment3 = new Payment(payment1);

        payment1.printObject();
        payment2.printObject();
        payment3.printObject();

        // Test Transfer class
        Transfer transfer1 = new Transfer("2023-05-14",200.0,"Salary Day 1");
        Transfer transfer2 = new Transfer("2023-05-15",175.0,"Bonus Day 1", "Yudha", "Coco");
        Transfer transfer3 = new Transfer(transfer1);

        transfer1.printObject();
        transfer2.printObject();
        transfer3.printObject();

        // Praktikum 1 Remade is done.


    }
}