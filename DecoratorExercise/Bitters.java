public class Bitters extends IngredientDecorator {
  public Bitters(Liquor liquor) {
    super(liquor);
    description = "Bitters";
  }

  public int calories() {
    return 20 + liquor.calories();
  }
}