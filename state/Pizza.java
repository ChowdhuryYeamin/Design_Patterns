public class Pizza {
    private PizzaState state;

    public Pizza() {
        state = new CookedState(); // Default state
    }

    public void setState(PizzaState state) {
        this.state = state;
    }

    public void bake() {
        state.bake(this);
    }

    public void deliver() {
        state.deliver(this);
    }

    public void makeUndeliverable() {
        state.makeUndeliverable(this);
    }
}

