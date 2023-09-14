import java.util.Scanner;

public class CashPayment implements PaymentStrategy {
    private static final double PRODUCT_PRICE = 10.0;

    public String processPayment() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sale amount:");
        double saleAmount = scanner.nextDouble();

        System.out.println("Enter the paid amount:");
        double paidAmount = scanner.nextDouble();

        double change = paidAmount - saleAmount;
        return "Cash payment processed. Change: $" + change + ".";
    }
}
