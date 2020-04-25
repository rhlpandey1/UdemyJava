package udemy.controlStatements;

public class Sum3And5 {
    public static void main(String[] args) {
        int count=0;
        int sum=0;
        for(int i=1;i<=1000;i++)
        {
            if((i%3==0)&& (i%5==0))
            {
                count++;
                System.out.println("The number divisible by 3 and 5 is ::"+ i);
                sum=sum+i;
            }
            if(count==5)
            {
                break;
            }
        }
        System.out.println("Sum is :->"+sum);
    }
}
