public class Lime extends IngredientDecorator {
  public Lime(Liquor liquor) {
    super(liquor);
    description = "Lime";
  }

  public int calories() {
    return 2 + liquor.calories();
  }
}