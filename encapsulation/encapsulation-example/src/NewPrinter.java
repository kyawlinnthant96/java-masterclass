public class NewPrinter {
    private int tonerLevel;
    private int pagePrinted;
    private boolean duplex;

    public NewPrinter(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : 0;
        this.duplex = duplex;
        this.pagePrinted = 0;
    }

    public int addToner(int tonerAmount) {
        int tempAmount = tonerAmount + tonerLevel;
        if (tonerLevel > 100 || tempAmount < 0) {
            return -1;
        }
        tonerLevel += tonerLevel;
        return tonerLevel;
    }

    public int printPages(int pages) {
        int jobPages = (duplex) ? (pages / 2) + (pages % 2) : pages;

        pagePrinted += jobPages;
        return jobPages;
    }

    public int getPagePrinted() {
        return pagePrinted;
    }
}
