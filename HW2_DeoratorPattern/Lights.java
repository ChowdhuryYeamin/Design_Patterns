public class Lights extends TreeDecorator {
    public Lights(ChristmasTree tree) {
        super(tree);
    }

    public double cost() {
        return tree.cost() + 5;
    }

    public String description() {
        return tree.description() + ", decorated with Lights";
    }
}