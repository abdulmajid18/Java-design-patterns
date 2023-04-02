public class MomoCreator extends PaymentCreator2 {
    @Override
    public Payment createPayment() {
        System.out.println("Overriding the main Factory to implement extra functionalities");
        System.out.println("Getting extra control");
        return new MomoPayment();
    }
}
