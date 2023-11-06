public class Sugar extends IngredientDecorator {
  public Sugar(Liquor liquor) {
    super(liquor);
    description = "Sugar";
  }

  public int calories() {
    return 300 + liquor.calories();
  }
}