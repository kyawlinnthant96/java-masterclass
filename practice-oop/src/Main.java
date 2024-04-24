public class Main {
    public static void main(String[] args) {
        MealOrder normalOrder = new MealOrder("regular","pesi","fried");
        normalOrder.addBurgerToppings("AVOCADO", "BACON", "LETTUCE", "CHEESE", "MAYO");
        normalOrder.printItemizedList();
    }
}
