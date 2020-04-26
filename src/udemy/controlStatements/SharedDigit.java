package udemy.controlStatements;

public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2) {
        if ((num1 >= 10 && num1 <= 99) && (num2 >= 10 && num2 <= 99)) {
                int dig1 = num1 % 10;
                num1 /= 10;
                int dig2 = num2 % 10;
                num2 /= 10;
                if (dig1 == dig2||num1==num2||dig1==num2||dig2==num1)
                    return true;

        } else
            return false;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
    }
}
