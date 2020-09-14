package udemy.arrays;

import java.util.Scanner;

public class ArrayDemo {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int[] myIntArray=getIntegerArrays(5);
        for(int i=0;i<myIntArray.length;i++)
            System.out.println("Element "+i+", typed value was  "+myIntArray[i]);
        System.out.println("Average of all the elements of the Array:->"+averageCalc(myIntArray));
    }
    public static int[] getIntegerArrays(int number){
        System.out.println("Enter "+number+" integer values \r");
        int[] values=new int[number];
        for(int i=0;i<values.length;i++){
            values[i]=sc.nextInt();
        }
        return values;
    }
    public static double averageCalc(int[] arr){
        double average=0.0;
        double sum=0.0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        average=sum/arr.length;
        return average;
    }
}
