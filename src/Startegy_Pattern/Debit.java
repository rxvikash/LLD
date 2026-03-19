package Startegy_Pattern;

public class Debit implements PaymentMethod{
    @Override
    public void paymentprocess() {
        System.out.println("Debit");
    }
}
