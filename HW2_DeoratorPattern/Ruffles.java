public class Ruffles extends TreeDecorator {
    public Ruffles(ChristmasTree tree) {
        super(tree);
    }

    public double cost() {
        return tree.cost() + 1;
    }

    public String description() {
        return tree.description() + ", decorated with Ruffles";
    }
}