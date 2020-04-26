package udemy.oops;

public class MainJava {
    public static void main(String[] args) {
        SimpleCalculator sc=new SimpleCalculator();
        sc.setFirstNumber(4.0);
        sc.setSecondNumber(0.0);
        System.out.println(sc.getAdditionResult());
        System.out.println(sc.getSubtractionResult());
        System.out.println(sc.getMultiplicationResult());
        System.out.println(sc.getDivisionResult());
    }
}
