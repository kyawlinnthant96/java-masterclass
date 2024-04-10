public class Car {
    private Engine engine;
    private Wheel[] wheels;

    public Car(Engine engine, Wheel[] wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    public void start() {
        engine.start();
    }
}

class Engine {
    private String type;
    public Engine(String type) {
        this.type = type;
    }
    public void start() {
        System.out.println(type + " engine started");
    }
}

class Wheel {
    private String position;
    public Wheel(String position) {
        this.position = position;
    }
}
