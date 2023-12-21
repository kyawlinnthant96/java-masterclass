public class Car {
    private String  description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Car -> start Engine");
    }

    protected void runEngine() {
        System.out.println("Car -> run Engine");
    }

    public void drive() {
        System.out.println("Car driving, type is " + getClass().getSimpleName());
        runEngine();
    }


}

class GasPoweredCar extends Car {
     private double avgKmPerLiter;
    private int cylinders = 6;

    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgKmPerLiter, int cylinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinder are fired up, Ready!%n", cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> usage exceed the average: %.2f %n", avgKmPerLiter);
    }
}
class ElectricCar extends Car {
     private double avgKmPerLiter;
    private int cylinders = 6;

    public ElectricCar(String description) {
        super(description);
    }

    public ElectricCar(String description, double avgKmPerLiter, int cylinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinder are fired up, Ready!%n", cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> usage exceed the average: %.2f %n", avgKmPerLiter);
    }
}
