public abstract class TreeDecorator extends ChristmasTree {
    protected ChristmasTree tree;
    protected boolean hasStar;

    public TreeDecorator(ChristmasTree tree) {
        this.tree = tree;
        this.hasStar = false;
    }

    
    public boolean hasStar() {
        return tree.hasStar() || this.hasStar;
    }

    public abstract double cost();
    public abstract String description();
}