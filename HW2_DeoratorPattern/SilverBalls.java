public class SilverBalls extends TreeDecorator {
    public SilverBalls(ChristmasTree tree) {
        super(tree);
    }

    public double cost() {
        return tree.cost() + 3.0;
    }

    public String description() {
        return tree.description() + ", decorated with Silver Balls";
    }
}