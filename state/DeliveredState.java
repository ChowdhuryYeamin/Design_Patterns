public class DeliveredState implements PizzaState {
    public void bake(Pizza pizza) {
        System.out.println("Pizza cannot be baked as it is already delivered.");
    }

    public void deliver(Pizza pizza) {
        System.out.println("Pizza is already delivered.");
    }

    public void makeUndeliverable(Pizza pizza) {
        System.out.println("Pizza cannot be undeliverable as it is already delivered.");
    }
}
