public class LEDs extends TreeDecorator {
    public LEDs(ChristmasTree tree) {
        super(tree);
    }

    public double cost() {
        return tree.cost() + 10;
    }

    public String description() {
        return tree.description() + ", decorated with LED lights";
    }
}