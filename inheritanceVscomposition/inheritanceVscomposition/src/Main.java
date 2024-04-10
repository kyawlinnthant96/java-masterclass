public class Main {
    public static void main(String[] args) {
      /*ComputerCase theCase = new ComputerCase("2208","Dell");
      Monitor theMonitor = new Monitor("Aoc3219","Aoc Inc");
      MotherBoard motherBoard = new MotherBoard("zeon2323","Asus");
      PersonalComputer myPc = new PersonalComputer("Asus2024", "Asus",theCase, theMonitor,motherBoard);
      myPc.powerUp();*/
//        SmartKitchen kitchen = new SmartKitchen();

//        kitchen.getDishWasher().setHasWorkToDo(true);
//        kitchen.getRefrigerator().setHasWorkToDo(true);
//        kitchen.getCoffeeMaker().setHasWorkToDo(true);
//
//        kitchen.getDishWasher().doDishes();
//        kitchen.getRefrigerator().orderFood();
//        kitchen.getCoffeeMaker().brewCoffee();

       BankAccount newAccount = new BankAccount("klt009911",1500000,12996,"kyaw@gmail.com");
       newAccount.getBalance();
        System.out.println("Total balance is: " + newAccount.getBalance());
       newAccount.withdraw(500);
       newAccount.getBalance();
        System.out.println("Total balance is: " + newAccount.getBalance());

    }
}
