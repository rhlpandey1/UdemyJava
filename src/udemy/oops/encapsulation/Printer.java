package udemy.oops.encapsulation;

public class Printer {
    private int tonerLevel;
    private int noOfPagesPrinted;
    private boolean duplexOrNot;

    public Printer(int tonerLevel, boolean duplexOrNot) {
        if (tonerLevel > -1 && tonerLevel < 100) {
            this.tonerLevel = tonerLevel;
        }
        this.noOfPagesPrinted = 0;
        this.duplexOrNot = duplexOrNot;
    }

    public int fillToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        } else
            return -1;


    }

    public int printPage(int pages) {
        int pagesToPrint = pages;
        if (this.duplexOrNot) {
            pagesToPrint =(pagesToPrint/2)+(pages%2);
            System.out.println("printing in duplex mode");
        }
        this.noOfPagesPrinted += pagesToPrint;
        return noOfPagesPrinted;
    }

    public int getNoOfPagesPrinted() {
        return noOfPagesPrinted;
    }
}
