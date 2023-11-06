public class Vermouth extends IngredientDecorator {
  public Vermouth(Liquor liquor) {
    super(liquor);
    description = "Vermouth";
  }

  public int calories() {
    return 40 + liquor.calories();
  }
}