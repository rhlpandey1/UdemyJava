package udemy.oops.encapsulation;

public class MainEncapsulation {
    public static void main(String[] args) {
        Printer printer=new Printer(50,true);
        System.out.println("initial page count   "+printer.getNoOfPagesPrinted());
        int pagesPrinted=printer.printPage(4);
        System.out.println("pages printed was "+pagesPrinted+" new total print count= "+printer.getNoOfPagesPrinted());
    }
}
