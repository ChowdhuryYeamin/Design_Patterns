public class BlueBalls extends TreeDecorator {
    public BlueBalls(ChristmasTree tree) {
        super(tree);
    }

    public double cost() {
        return tree.cost() + 2.0;
    }

    public String description() {
        return tree.description() + ", decorated with Blue Balls";
    }
}