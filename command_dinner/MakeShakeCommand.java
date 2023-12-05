public class MakeShakeCommand implements Command {
    private ShortOrderCook cook;
    private boolean isMade = false;

    public MakeShakeCommand(ShortOrderCook cook) {
        this.cook = cook;
    }

    public void execute() {
        cook.makeShake();
        isMade = true;
    }

    public void undo() {
        if (isMade) {
            cook.undoMakeShake();
        }
    }
}