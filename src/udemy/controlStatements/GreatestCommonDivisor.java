package udemy.controlStatements;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first,int second)
    {
        if(first<10||second<10)
            return -1;
        int gcd=0;
        int min= Math.min(first,second);
        for(int i=1;i<=min;i++)
        {
           if((first%i==0 )&& (second%i==0))
            {
                gcd=i;
            }

        }
            return gcd;
    }

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(1010,10));
    }
}
