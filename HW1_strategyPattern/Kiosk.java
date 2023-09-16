public class Kiosk extends POS {
    public Kiosk() {
        setOrderNumberStrategy(new ManualOrderNumber());
        setPaymentStrategy(new CashPayment());
    }
}