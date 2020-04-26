package udemy.controlStatements;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number)
    {
        int sum=0;
        if(number<0)
            return -1;
            int lastDigit=number%10;
            int firstDigit=number;
            while(firstDigit>=10)
            {
                firstDigit/=10;
            }
            sum+=(firstDigit+lastDigit);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(5));
    }
}
