package udemy.controlStatements;

public class SumOfDigits {
    public static int sumDigits(int num)
    {
        int sum=0;
        if(num<10)
            return -1;
        else
        {
          while(num!=0)
          {
              sum+=(num%10);
              num/=10;
          }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(125));
    }
}
