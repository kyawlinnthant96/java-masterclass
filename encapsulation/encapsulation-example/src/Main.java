public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50, false);
        System.out.println("initial page count = " + printer.getPagePrinted());

        int pagesPrinted = printer.printPages(5);
        System.out.printf("Current job Pages: %d, Printer Total: %d %n", pagesPrinted, printer.getPagePrinted());
        pagesPrinted = printer.printPages(10);
        System.out.printf("Current job Pages: %d, Printer Total: %d %n", pagesPrinted, printer.getPagePrinted());
        pagesPrinted = printer.printPages(10);
        System.out.printf("Current job Pages: %d, Printer Total: %d %n", pagesPrinted, printer.getPagePrinted());
    }
}
