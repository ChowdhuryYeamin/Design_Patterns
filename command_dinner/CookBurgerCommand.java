public class CookBurgerCommand implements Command {
    private ShortOrderCook cook;
    private boolean isCooked = false;

    public CookBurgerCommand(ShortOrderCook cook) {
        this.cook = cook;
    }

    public void execute() {
        cook.cookBurger();
        isCooked = true;
    }

    public void undo() {
        if (isCooked) {
            cook.undoCookBurger();
        }
    }
}
