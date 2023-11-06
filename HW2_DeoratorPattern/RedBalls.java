public class RedBalls extends TreeDecorator {
    public RedBalls(ChristmasTree tree) {
        super(tree);
    }

    public double cost() {
        return tree.cost() + 1.0;
    }

    public String description() {
        return tree.description() + ", decorated with Red Balls";
    }
}