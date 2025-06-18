package AdapterPatternExample;

public class AdapterMain {
    public static void main(String[] args) {
        // Using PayPal
        PayPalGateway paypal = new PayPalGateway();
        PaymentProcessor paypalAdapter = new PayPalAdapter(paypal);
        paypalAdapter.processPayment(1500);

        // Using Stripe
        StripeGateway stripe = new StripeGateway();
        PaymentProcessor stripeAdapter = new StripeAdapter(stripe);
        stripeAdapter.processPayment(3000);
    }
}