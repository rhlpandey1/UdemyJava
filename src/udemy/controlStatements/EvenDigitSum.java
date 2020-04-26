package udemy.controlStatements;

public class EvenDigitSum {
    public static int getEvenDigitSum(int num)
    {
        int sum=0;
        if(num<0)
            return -1;
        while(num>0)
        {
            int digit=num%10;
            if(digit%2==0)
                sum+=digit;
            num/=10;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(252));
    }
}
