package udemy.controlStatements;

public class PrimeNumbers {
    public static boolean isPrime(int num) {
        if (num == 1)
            return false;
        //  for(int i=2;i<=num/2;i++)
        //optimizing way to do it
        for (int i = 2; i <= (long) Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Is Prime?  " + isPrime(1));
    }
}
