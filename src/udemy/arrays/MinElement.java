package udemy.arrays;

import java.util.Scanner;

public class MinElement {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter count :- .\r");
        int count=scanner.nextInt();
        int []testArray= readIntegers(count);
        //printArray(testArray);
        int min=findMin(testArray);
        System.out.println("Minimum element is "+min);
        int minUsingMath=findMinUsingMath(testArray);
        System.out.println("Minimum element is "+minUsingMath);

    }
    public static int findMin(int []myIntArray){
        int min=0;
        min=myIntArray[0];
        for(int i=1;i<myIntArray.length;i++)
        {
          if(myIntArray[i]<min)
              min=myIntArray[i];
        }
        return min;
    }
    public static int findMinUsingMath(int []myIntArray){
        int min=0;
        min=myIntArray[0];
        for(int i=1;i<myIntArray.length;i++)
        {
            min=Math.min(min,myIntArray[i]);
        }
        return min;
    }
    public  static void printArray(int[] myIntArray)
    {
        for(int i=0;i<myIntArray.length;i++)
        {
            System.out.println("Value at  "+i+ "th position is :-> "+myIntArray[i]);
        }
    }
    public static int[] readIntegers(int count)
    {
        int[] values=new int[count];
        System.out.println("Enter "+count+ "values :.\r");
        for(int i=0;i<count;i++)
        {
            values[i]=scanner.nextInt();
        }
        return values;
    }
}
