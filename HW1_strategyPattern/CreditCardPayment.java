import java.util.Scanner;

public class CreditCardPayment implements PaymentStrategy {
    private static final double PRODUCT_PRICE = 10.0;

    public String processPayment() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the credit card number:");
        String cardNumber = scanner.nextLine();  // Not being used further for simplicity

        System.out.println("Enter the sale amount:");
        double saleAmount = scanner.nextDouble();

        return "Credit card payment of $" + saleAmount + " processed for card ending in " + cardNumber.substring(cardNumber.length() - 4);
    }
}

