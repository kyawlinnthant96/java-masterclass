public class CarMain {
    public static void main(String[] args) {
        /*Car car = new Car("2022 Mark-x Toyota");
        runRace(car);

        Car ferrari = new GasPoweredCar("2023 Toyata Skyline T023",15.4,6);
        runRace(ferrari);*/
        Worker annie = new Employee("Annie", "12.12.1996","12.12.2022");
        System.out.println("new employee: " + annie);
        System.out.println(annie.getAge());
        System.out.println(annie.collectPay());
    }

    public static void runRace(Car car) {
        car.startEngine();
        car.drive();
    }
}
