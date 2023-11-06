public class Star extends TreeDecorator {
    private boolean isStarAdded;

    public Star(ChristmasTree tree) {
        super(tree);
        if (tree.hasStar()) {
            System.out.println("The tree already has a star!");
            this.isStarAdded = false;
        } else {
            this.hasStar = true;
            this.isStarAdded = true;
        }
    }


    public String description() {
        return isStarAdded ? tree.description() + ", a Star" : tree.description();
    }


    public double cost() {
        return isStarAdded ? tree.cost() + 4 : tree.cost();
    }


    public boolean hasStar() {
        return isStarAdded || tree.hasStar();
    }
}
