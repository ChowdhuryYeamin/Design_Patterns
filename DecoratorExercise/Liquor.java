public abstract class Liquor {
  String description = "unknown Liquor";

  public String getDescription() {
    return description;
  }

  public abstract int calories();
}