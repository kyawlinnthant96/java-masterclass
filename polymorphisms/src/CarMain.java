public class CarMain {
    public static void main(String[] args) {
        Car car = new Car("2022 Blue Ferrari 296 GTS");
        runRace(car);

        Car ferrari = new GasPoweredCar("2022 Blue Ferrari 296 GTS",
                15.4, 6);
        runRace(ferrari);

        Car tesla = new ElectricCar("2022 Red Tesla Model 3",
                568, 75);
        runRace(tesla);


    }

    public static void runRace(Car car) {

        car.startEngine();
        car.drive();
    }
//        Worker annie = new Employee("Annie", "12.12.1996","12.12.2022");
//        System.out.println("new employee: " + annie);
//        System.out.println(annie.getAge());
//        System.out.println(annie.collectPay());


}
