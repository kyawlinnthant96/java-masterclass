public class PersonalComputer extends Product{
    private ComputerCase computerCase;
    private Monitor monitor;
    private MotherBoard motherBoard;

    public PersonalComputer(String modal, String manufacturer, ComputerCase computerCase, Monitor monitor, MotherBoard motherBoard) {
        super(modal, manufacturer);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public ComputerCase getComputerCase() {
        return computerCase;
    }

    public void drawLogo() {
         monitor.drawPixelAt(1920,1080,"red");
    }

    public void powerUp() {
        computerCase.pressPowerButton();
        drawLogo();
    }
}
