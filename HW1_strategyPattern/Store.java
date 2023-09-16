import java.util.Scanner;

public class Store extends POS {
    public Store() {
        setOrderNumberStrategy(new AutomatedOrderNumber());
        choosePaymentMethod();
    }

    private void choosePaymentMethod() {
        System.out.println("Choose Payment Method: 1 for Cash, 2 for Credit Card");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if (choice == 1) {
            setPaymentStrategy(new CashPayment());
        } else if (choice == 2) {
            setPaymentStrategy(new CreditCardPayment());
        }
    }
}