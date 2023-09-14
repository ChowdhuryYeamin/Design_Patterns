import java.util.Scanner;

public class ManualOrderNumber implements OrderNumberStrategy {
    public String getOrderNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Order Number from the ticket:");
        return "Manual-" + scanner.nextLine();
    }
}
