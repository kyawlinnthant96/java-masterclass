public class Product {
    private String modal;
    private String manufacturer;
    private int width;
    private int height;
    private int depth;

    public Product(String modal, String manufacturer) {
        this.modal = modal;
        this.manufacturer = manufacturer;
    }
}

class Monitor extends Product{
    private int size;
    private String resolution;

    public Monitor(String modal, String manufacturer) {
        super(modal, manufacturer);
    }

    public Monitor(String modal, String manufacturer, int size, String resolution) {
        super(modal, manufacturer);
        this.size = size;
        this.resolution = resolution;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println(String.format("drawPixelAt(%d, %d, %s)", x, y, color));
    }
}

class MotherBoard extends Product{
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public MotherBoard(String modal, String manufacturer) {
        super(modal, manufacturer);
    }

    public MotherBoard(String modal, String manufacturer, int ramSlots, int cardSlots, String bios) {
        super(modal, manufacturer);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram(String programName) {
        System.out.println("Loading program: " + programName);
    }
}

class ComputerCase extends Product{
    private String powerSupply;

    public ComputerCase(String modal, String manufacturer) {
        super(modal, manufacturer);
    }

    public ComputerCase(String modal, String manufacturer, String powerSupply) {
        super(modal, manufacturer);
        this.powerSupply = powerSupply;
    }

    public void pressPowerButton() {
        System.out.println("Power button pressed");
    }
}
