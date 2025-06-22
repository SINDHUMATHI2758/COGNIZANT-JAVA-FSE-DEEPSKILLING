public class Main {
    public static void main(String[] args) {
        PaymentProcessor paypalProcessor = new PayPalAdapter();
        paypalProcessor.processPayment(1500.0);

        PaymentProcessor stripeProcessor = new StripeAdapter();
        stripeProcessor.processPayment(2300.0);
    }
}
