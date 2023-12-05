import java.util.Stack;

public class Waitress {
    private Stack<Command> orderHistory = new Stack<>();

    public void takeOrder(Command command) {
        orderHistory.push(command);
        command.execute();
    }

    public void undoOrder() {
        if (!orderHistory.empty()) {
            Command command = orderHistory.pop();
            command.undo();
        }
    }
}
