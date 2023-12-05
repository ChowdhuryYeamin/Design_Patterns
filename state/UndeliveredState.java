public class UndeliveredState implements PizzaState {
    public void bake(Pizza pizza) {
        System.out.println("Pizza cannot be baked as it is eaten by the kitchen staff.");
    }

    public void deliver(Pizza pizza) {
        System.out.println("Pizza cannot be delivered as it is eaten by the kitchen staff.");
    }

    public void makeUndeliverable(Pizza pizza) {
        System.out.println("Pizza is already undeliverable and eaten by the kitchen staff.");
    }
}
