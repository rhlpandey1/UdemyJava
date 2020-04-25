package udemy.controlStatements;

public class PrimeNumberChallenge {
    public static boolean isPrime(int num)
    {
        if(num==1)
            return false;
      //  for(int i=2;i<=num/2;i++)
        //optimizing way to do it
        for(int i=2;i<=(long)Math.sqrt(num);i++)
        {
            if(num%i==0)
                return false;
        }
        return true;
    }
    public static void incrementPrime(int start,int end)
    {
        int count=0;
        for(int i=start;i<=end;i++)
        {
            if(isPrime(i))
            {
                count++;
                System.out.println("Number "+i+" is a prime number");
                System.out.println("The new number is "+(i+1));
            }
            if(count==3)
            {
                System.out.println("Exiting for loop");
                break;
            }

        }
    }

    public static void main(String[] args) {
        System.out.println("Is Prime?  "+isPrime(1));
       incrementPrime(10,50);
    }
}
