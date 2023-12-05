import java.util.ArrayList;
import java.util.List;

public class Customer {
    private List<Command> orders;

    public Customer() {
        this.orders = new ArrayList<>();
    }

    public void addOrder(Command order) {
        orders.add(order);
    }

    public void placeOrders(Waitress waitress) {
        for (Command order : orders) {
            waitress.takeOrder(order);
        }
    }

    public void undoOrders(Waitress waitress) {
        waitress.undoOrder();
    }
}
