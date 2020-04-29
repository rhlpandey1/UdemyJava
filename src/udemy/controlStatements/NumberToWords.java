package udemy.controlStatements;

public class NumberToWords {
    public static void numberToWords(int num){
        if(num<0)
        {
            System.out.println("Invalid Value");
        }
        int number=reverse(num);
        int digDiff=getDigitCount(num)-getDigitCount(number);
        do
        {
            int dig=number%10;
            number=number/10;
            switch (dig)
            {
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;

            }

        }while(number!=0);
        if(digDiff>0)
        {
            for(int i=0;i<digDiff;i++)
            {
                System.out.print("Zero ");
            }
        }
    }
    public static int reverse(int number){
        int temp=0;
        while(number!=0)
        {
            int lastDigit=number%10;
            temp=(temp*10)+lastDigit;
            number/=10;
        }
        return temp;
    }
    public static int getDigitCount(int number){
        if(number<0)
            return -1;
        int count=0;
        do
        {
            count++;
            number/=10;
        }while(number!=0);
        return count;
    }

    public static void main(String[] args) {
        numberToWords(1450);
        System.out.println("No of digits are :->"+getDigitCount(1450));
    }
}
