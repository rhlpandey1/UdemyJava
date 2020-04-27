package udemy.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayDesc {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        int []testArray=getArray(5);
        //printArray(testArray);
        int[] sortedArray=sortArray(testArray);
        printArray(sortedArray);

    }
    public static int[] sortArray(int []myIntArray){
      /*  int []sortedArray=new int[myIntArray.length];
        for(int i=0;i<myIntArray.length;i++)
        {
            sortedArray[i]=myIntArray[i];
        }*/
        int []sortedArray= Arrays.copyOf(myIntArray,myIntArray.length);
        boolean flag=true;
        int temp;
        while(flag)
        {
            flag=false;
            for(int i=0;i<sortedArray.length-1;i++)
            {
                if(sortedArray[i]<sortedArray[i+1])
                {
                    temp=sortedArray[i];
                    sortedArray[i]=sortedArray[i+1];
                    sortedArray[i+1]=temp;
                    flag=true;
                }
            }
        }
      //  Arrays.sort(sortedArray, Collections.reverseOrder());
        return sortedArray;
    }
    public  static void printArray(int[] myIntArray)
    {
        for(int i=0;i<myIntArray.length;i++)
        {
            System.out.println("Value at  "+i+ "th position is :-> "+myIntArray[i]);
        }
    }
    public static int[] getArray(int number)
    {
        int[] values=new int[number];
        System.out.println("Enter "+number+ "values :.\r");
        for(int i=0;i<number;i++)
        {
            values[i]=scanner.nextInt();
        }
        return values;
    }
}
