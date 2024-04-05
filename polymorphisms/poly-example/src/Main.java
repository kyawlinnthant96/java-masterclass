public class Main {
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("22022","Hp","240");
        Monitor theMonitor = new Monitor("27 inch Beast", "GL" ,28,"1920 * 1080");
        Motherboard theMotherboard = new Motherboard("Asus-z-1000","Asus",4,6, "v2.44");

        PersonalComputer thePc = new PersonalComputer("22022","Hp",theCase,theMonitor, theMotherboard);

        thePc.powerUp();
    }
}
