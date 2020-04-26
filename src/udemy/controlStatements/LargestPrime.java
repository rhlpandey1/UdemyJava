package udemy.controlStatements;

public class LargestPrime {
    public static int getLargestPrime(int num) {
        if(num<=0)
            return -1;
        // Initialize the maximum prime
        // factor variable with the
        // lowest one
        int maxPrime = -1;

        // Print the number of 2s
        // that divide n
        while (num % 2 == 0) {
            maxPrime = 2;
            // equivalent to n /= 2
            num /= 2;
        }

        // n must be odd at this point,
        // thus skip the even numbers
        // and iterate only for odd
        // integers
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            while (num % i == 0) {
                maxPrime = i;
                num = num / i;
            }
        }

        // This condition is to handle
        // the case when n is a prime
        // number greater than 2
        if (num > 2)
            maxPrime = num;

        return maxPrime;
    }

    public static void main(String[] args) {
        System.out.println(getLargestPrime(44));
    }
}
