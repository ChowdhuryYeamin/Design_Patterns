public class Cherry extends IngredientDecorator {
  public Cherry(Liquor liquor) {
    super(liquor);
    description = "Cherry";
  }

  public int calories() {
    return 40 + liquor.calories();
  }
}