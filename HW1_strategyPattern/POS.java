public class POS {
    private OrderNumberStrategy orderNumberStrategy;
    private PaymentStrategy paymentStrategy;

    public void setOrderNumberStrategy(OrderNumberStrategy strategy) {
        this.orderNumberStrategy = strategy;
    }

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }

    public String generateOrderNumber() {
        return orderNumberStrategy.getOrderNumber();
    }

    public String makePayment() {
        return paymentStrategy.processPayment();
    }
}
