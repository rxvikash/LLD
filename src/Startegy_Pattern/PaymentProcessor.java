package Startegy_Pattern;

public class PaymentProcessor {

   private PaymentMethod payment;

    public void setPayment(PaymentMethod payment) {
        this.payment = payment;
    }

    public void pay(){
        payment.paymentprocess();
    }

}
