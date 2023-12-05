public class CookedState implements PizzaState {



    public void bake(Pizza pizza) {
        System.out.println("Pizza is  cooked and starting bake.");
        pizza.setState(new BakedState());
    }

    public void deliver(Pizza pizza) {
        System.out.println("Pizza must be baked before delivery.");
    }

    public void makeUndeliverable(Pizza pizza) {
        System.out.println("Pizza cannot be delivered and is eaten by the kitchen staff.");
        pizza.setState(new UndeliveredState());
    }
}

