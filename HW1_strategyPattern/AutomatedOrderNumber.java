public class AutomatedOrderNumber implements OrderNumberStrategy {
    public String getOrderNumber() {
        return "Auto-" + System.currentTimeMillis();
    }
}
