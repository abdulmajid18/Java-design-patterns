public abstract class PaymentCreator2 {

    public abstract Payment createPayment();

    public void makePayment() {
        Payment payment = createPayment();

        payment.pay();
    }
}
