public abstract class IngredientDecorator extends Liquor {
  Liquor liquor;
  
  public IngredientDecorator(Liquor liquor) {
    this.liquor = liquor;
  }
  
  // public abstract String getDescription();
  // public abstract int calories();
}