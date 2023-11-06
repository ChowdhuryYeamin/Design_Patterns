public class Ribbons extends TreeDecorator {
    public Ribbons(ChristmasTree tree) {
        super(tree);
    }

    public double cost() {
        return tree.cost() + 2;
    }

    public String description() {
        return tree.description() + ", decorated with Ribbons";
    }
}