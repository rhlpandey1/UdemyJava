package udemy.controlStatements;

public class NumberPalindrome {
    public static boolean isPalindrome(int number)
    {
        int numTemp=number;
        int numRev = 0;
        while(number!=0)
        {
            int lastDigit=number%10;
            numRev=lastDigit+(numRev*10);
            number=number/10;
        }
        if(numTemp==numRev)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }
}
