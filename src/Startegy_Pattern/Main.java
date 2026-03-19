package Startegy_Pattern;

public class Main {
     void main() {

         PaymentProcessor pay = new PaymentProcessor();

         pay.setPayment(new UPI());
         pay.pay();

         pay.setPayment(new Debit());
         pay.pay();

    }
}
