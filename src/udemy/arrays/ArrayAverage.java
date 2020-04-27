package udemy.arrays;

import java.util.Scanner;

public class ArrayAverage {
    private static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {

      int []myIntegers=getIntegers(5);
      for(int i=0;i<myIntegers.length;i++) {
          System.out.println("the value of pos  "+i+"  is  "+myIntegers[i]);
      }
        System.out.println("Average "+getAverage(myIntegers));
    }
    public static double getAverage(int[] array)
    {
        int sum=0;
        for(int i=0;i<array.length;i++)
        {
            sum+=array[i];
        }
        return (double) sum/(double) array.length;

    }
    public static int[] getIntegers(int number)
    {
        System.out.println("Enter "+number+ "integer values.\r");
        int[] values=new int[number];
        for(int i=0;i<number;i++)
        {
            values[i]=scanner.nextInt();
        }
        return values;
    }
}
