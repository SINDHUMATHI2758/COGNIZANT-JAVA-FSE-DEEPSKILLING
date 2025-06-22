public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        System.out.println("=== Paying with Credit Card ===");
        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432"));
        context.processPayment(2500.00);

        System.out.println("\n=== Paying with PayPal ===");
        context.setPaymentStrategy(new PayPalPayment("user@example.com"));
        context.processPayment(1800.50);
    }
}
