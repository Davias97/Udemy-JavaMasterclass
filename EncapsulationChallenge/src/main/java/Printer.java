public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPrinted = 0;
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        if (tonerLevel + tonerAmount > 100 || tonerLevel + tonerAmount < 0) {
            return -1;
        }
        return tonerLevel += tonerAmount;
    }

    public int printPages(int pages) {
        if (duplex) {
            System.out.println("Duplex printing.");
            pagesPrinted += pages / 2 + pages % 2;
            return pages / 2 + pages % 2;
        }
        pagesPrinted += pages;
        return pages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
