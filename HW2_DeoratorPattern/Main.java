public class Main {
    public static void main(String[] args) {


        ChristmasTree tree = new ColoradoBlueSpruce();
        tree = new Star(tree);
        tree = new Ruffles(tree);
        tree = new Star(tree);
        tree = new Ruffles(tree);
        printTree(tree);


        // Fraser Fir decoration
        ChristmasTree fraserFir = new FraserFir();
        fraserFir = new Star(fraserFir);
        fraserFir = new Ribbons(fraserFir);
        fraserFir = new RedBalls(fraserFir);
        fraserFir = new Star(fraserFir); // Trying to add another star
        printTree(fraserFir);

        // Douglas Fir decoration
        ChristmasTree douglasFir = new DouglasFir();
        douglasFir = new Lights(douglasFir);
        douglasFir = new LEDs(douglasFir);
        douglasFir = new Star(douglasFir);
        douglasFir = new Star(douglasFir); // Trying to add another star
        printTree(douglasFir);

        // Balsam Fir decoration
        ChristmasTree balsamFir = new BalsamFir();
        balsamFir = new SilverBalls(balsamFir);
        balsamFir = new Ruffles(balsamFir);
        balsamFir = new Star(balsamFir);
        printTree(balsamFir);

        // Colorado Blue Spruce decoration
        ChristmasTree blueSpruce = new ColoradoBlueSpruce();
        blueSpruce = new BlueBalls(blueSpruce);
        blueSpruce = new Ribbons(blueSpruce);
        blueSpruce = new Star(blueSpruce);
        printTree(blueSpruce);
    }

    private static void printTree(ChristmasTree tree) {
        System.out.println(tree.description() + " costs $" + tree.cost());
    }
}
