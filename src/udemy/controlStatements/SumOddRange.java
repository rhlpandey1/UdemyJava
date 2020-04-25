package udemy.controlStatements;

public class SumOddRange {
    public  static boolean isOdd(int number)
    {
        boolean isOdd=false;
        if(number>0)
        {
            if(number%2!=0)
                isOdd=true;
            else
                isOdd=false;
        }


        return isOdd;
    }
    public static int sumOdd(int start,int end)
    {
        int sum=0;
        if(end>=start&&start>0&&end>0)
        {
            for(int i=start;i<=end;i++)
            {
                if(isOdd(i))
                {
                    sum=sum+i;
                }
            }
        }
        else
            return -1;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOdd(100,1000));
    }
}
