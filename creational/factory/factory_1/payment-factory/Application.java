import java.util.Random;

public class Application {

    private static PaymentCreator paymentCreator;
    private static PaymentCreator2 paymentCreator2;

    public static void main(String[] args) {
        // buy(PaymentTypes.CASH);
        runPayMent2(PaymentTypes.DEBIT);
    }

    static void buy(PaymentTypes paymentTypes) {
        Payment myPayment = paymentCreator.setUpPayments(paymentTypes);
        myPayment.pay();

    }

    static void runPayMent2(PaymentTypes paymentTypes) {
        if (paymentTypes == PaymentTypes.MOMO)
            paymentCreator2 = new MomoCreator();
        paymentCreator2.makePayment();
    }
}
