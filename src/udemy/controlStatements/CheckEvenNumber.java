package udemy.controlStatements;

public class CheckEvenNumber {

    public static boolean isEven(int n)
    {
            if(n%2==0)
                return true;
            else
                return false;
    }

    public static void main(String[] args) {
        int num=4;
        int finishNum=20;
        while(num<=finishNum)
        {
            num++;
            if(!isEven(num))
                continue;
            System.out.println("even no is"+num);

        }
    }
}
