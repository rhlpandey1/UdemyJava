package udemy.controlStatements;

import java.util.Scanner;

public class InputCalculator {
   // private static Scanner scanner=new Scanner(System.in);
    public static void inputThenPrintSumAndAverage(){
       // System.out.println("Enter the number :");
        Scanner scanner=new Scanner(System.in);
        int count=0;
        int sum=0;
        long average=0;
        while(true)
        {
            boolean isInt=scanner.hasNextInt();
            if(isInt)
            {
                count++;
                int number=scanner.nextInt();
                sum+=number;
                average=Math.round((double)sum/(double)count);
            }
            else
            {
                break;
            }
            //scanner.nextLine();
        }
        System.out.println("SUM = "+sum+" AVG = "+average);
        scanner.close();
    }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
}
