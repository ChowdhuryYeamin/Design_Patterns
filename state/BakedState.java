public class BakedState implements PizzaState {
    public void bake(Pizza pizza) {
        System.out.println("Pizza is already baked.");
    }

    public void deliver(Pizza pizza) {
        System.out.println("Pizza is being delivered.");
        pizza.setState(new DeliveredState());
    }

    public void makeUndeliverable(Pizza pizza) {
        System.out.println("Pizza cannot be delivered and is eaten by the kitchen staff.");
        pizza.setState(new UndeliveredState());
    }
}
