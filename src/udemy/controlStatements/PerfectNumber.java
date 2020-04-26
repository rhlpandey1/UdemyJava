package udemy.controlStatements;

public class PerfectNumber {
    public static boolean isPerfectNumber(int num)
    {
        int sum=0;
        if(num<1)
            return false;
        for(int i=1;i<num;i++)
        {
            if(num%i==0)
            {
                sum+=i;
            }
        }
        if(sum==num)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(-1+" is a perfect number?  " +isPerfectNumber(-1));
    }
}
