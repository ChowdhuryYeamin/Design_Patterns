class Main {
  public static void main(String[] args) {
    Liquor liquor = new Vodka();
    liquor = new LimeJuice(liquor);
    System.out.println(liquor.calories());

    Liquor cocktail = new Gin();
    cocktail = new LimeJuice(new Sugar(cocktail));
    System.out.println(cocktail.calories());

    Liquor cocktail2 = new Bourban();
    cocktail2 = new Bitters(cocktail2);
    cocktail2 = new Cherry(cocktail2);
    System.out.println(cocktail2.calories());
    
  }
}