package udemy.controlStatements;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if ((num1 >= 10 && num1 <= 1000) && (num2 >= 10 && num2 <= 1000) && (num3 >= 10 && num3 <= 1000)) {
            int dig1 = num1 % 10;
            int dig2 = num2 % 10;
            int dig3 = num3 % 10;
            if (dig1 == dig2 || dig1 == dig3 || dig2 == dig3)
                return true;

        } else
            return false;
        return false;
    }
    public static boolean isValid(int num1)
    {
        if ((num1 >= 10 && num1 <= 1000))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(9,22,71));
    }
}
