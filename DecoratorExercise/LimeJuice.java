public class LimeJuice extends IngredientDecorator {
  public LimeJuice(Liquor liquor) {
    super(liquor);
    description = "LimeJuice";
  }

  public int calories() {
    return 8 + liquor.calories();
  }
}