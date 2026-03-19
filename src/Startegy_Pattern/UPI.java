package Startegy_Pattern;

public class UPI implements PaymentMethod{
    @Override
    public void paymentprocess() {
        System.out.println("UPI");
    }
}
