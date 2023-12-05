public interface PizzaState {
    void bake(Pizza pizza);
    void deliver(Pizza pizza);
    void makeUndeliverable(Pizza pizza);
}

