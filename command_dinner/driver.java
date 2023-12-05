public class driver {
    public static void main(String[] args) {
        // Create the receiver
        ShortOrderCook cook = new ShortOrderCook();

        // Create the invoker
        Waitress waitress = new Waitress();

        // Create the commands
        Command burgerOrder = new CookBurgerCommand(cook);
        Command shakeOrder = new MakeShakeCommand(cook);

        // Create a customer and add orders
        Customer customer1 = new Customer();
        customer1.addOrder(burgerOrder);
        customer1.addOrder(shakeOrder);

        // Place the orders
        customer1.placeOrders(waitress);

        // Undo the last order
        customer1.undoOrders(waitress);
        customer1.undoOrders(waitress);

    
    }
}
