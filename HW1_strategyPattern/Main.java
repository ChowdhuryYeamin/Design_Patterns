import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        POS kioskPOS = new POS();
        kioskPOS.setOrderNumberStrategy(new ManualOrderNumber());
        kioskPOS.setPaymentStrategy(new CashPayment());

        System.out.println("Kiosk Order Number: " + kioskPOS.generateOrderNumber());
        System.out.println(kioskPOS.makePayment());

        POS storePOS = new POS();
        storePOS.setOrderNumberStrategy(new AutomatedOrderNumber());
        System.out.println("Store Order Number: " + storePOS.generateOrderNumber());

        System.out.println("Choose Payment Method: 1 for Cash, 2 for Credit Card");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if (choice == 1) {
            storePOS.setPaymentStrategy(new CashPayment());
        } else if (choice == 2) {
            storePOS.setPaymentStrategy(new CreditCardPayment());
        }
        
        System.out.println(storePOS.makePayment());
    }
}