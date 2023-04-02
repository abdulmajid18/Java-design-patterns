public class PaymentCreator {

    public PaymentCreator() {
    }

    public Payment setUpPayments(PaymentTypes paymentTypes) {
        if (paymentTypes == PaymentTypes.MOMO) {
            System.out.println("momo");
            return new MomoPayment();
        } else if (paymentTypes == PaymentTypes.CASH) {
            System.out.println("Cash");
            return new CashPayment();
        } else if (paymentTypes == PaymentTypes.DEBIT) {
            System.out.println("Debit");
            return new DebitPayment();
        } else {
            System.out.println("Yo Nulllllllllllllllllllllll");
            return null;
        }
    }
}
