public class BuildPizza {
    public static void main(String[] args) {
        Pizza pizza = new Pizza(); 

        try {
            
            System.out.println("Attempting to bake the pizza...");
            pizza.bake();
            System.out.println("Current State: Baked");

            
            System.out.println("Attempting to deliver the pizza...");
            pizza.deliver();
            System.out.println("Current State: Delivered");

            
            System.out.println("Attempting to bake the pizza again...");
            pizza.bake();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        
        Pizza pizza2 = new Pizza(); 
        try {
            
            System.out.println("Making the pizza undeliverable...");
            pizza2.makeUndeliverable();
            System.out.println("Current State: Eaten by Kitchen Staff");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}