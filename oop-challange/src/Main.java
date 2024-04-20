public class Main {
    public static void main(String[] args) {
       /* Item coke = new Item("coke", "drink",1.50);
        coke.printItem();
        coke.setSize("LARGE");
        coke.printItem();

        Item avocado = new Item("avocado", "Topping",1.50);
        avocado.printItem();
        avocado.setSize("SMALL");
        avocado.printItem();*/

//        Burger burger = new Burger("regular", 4.0);
//        burger.addToppings("BACON", "CHEESE", "MAYO");
//        burger.setSize("large");
//        burger.printItem();

        /*MealOrder mealOrder = new MealOrder();
        mealOrder.addBurgerToppings("BEACON","CHEESE", "MAYO");
        mealOrder.setDrinkSize("LARGE");
        mealOrder.printItemizedList();*/

       /* MealOrder secondOrder = new MealOrder("turkey", "pessi", "nuggets");
        secondOrder.addBurgerToppings("BACON", "CHILLI", "MAYO");
        secondOrder.setDrinkSize("SMALL");
        secondOrder.printItemizedList();*/

        MealOrder deluxeOrder = new MealOrder("deluxe", "Sprise", "fries");
        deluxeOrder.addBurgerToppings("AVOCADO", "BACON", "LETTUCE", "CHEESE", "MAYO");
        deluxeOrder.setDrinkSize("SMALL");
        deluxeOrder.printItemizedList();
    }
}
