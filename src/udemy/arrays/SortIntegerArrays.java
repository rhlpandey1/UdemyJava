package udemy.arrays;

import java.util.Scanner;

public class SortIntegerArrays {
    public static Scanner sc=new Scanner(System.in);
    public static int[] getIntegerArrays(int number){
        System.out.println("Enter "+number+" integer values \r");
        int[] values=new int[number];
        for(int i=0;i<values.length;i++){
            values[i]=sc.nextInt();
        }
        return values;
    }
    public static void printArrays(int[] arr){

        for(int i=0;i<arr.length;i++)
            System.out.println("Element "+i+", typed value was  "+arr[i]);
    }
    public static int[] getSortedIntegerArrays(int[] intArray){
        int temp=0;

        for(int i=0;i<intArray.length-1;i++){
            for(int j=i+1;j<intArray.length;j++){
                if(intArray[i]<intArray[j]){
                    temp=intArray[i];
                    intArray[i]=intArray[j];
                    intArray[j]=temp;
                }
            }
        }
        return intArray;
    }
    public static void main(String[] args) {
        int[] myIntArray=getIntegerArrays(5);
        printArrays(myIntArray);
        int[] sortedArray=getSortedIntegerArrays(myIntArray);
        System.out.println("After sorting");
        printArrays(sortedArray);
    }
}
