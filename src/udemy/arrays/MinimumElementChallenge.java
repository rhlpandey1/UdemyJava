package udemy.arrays;

import java.util.Scanner;

public class MinimumElementChallenge {
    public static Scanner sc=new Scanner(System.in);
    public static int[] readIntegers(int count){
        System.out.println("Enter the numbers .\r");
        int[] arr=new int[count];
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static int findMin(int[] arr){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min)
                min=arr[i];
        }
        return min;
    }
    public static void main(String[] args) {
        System.out.println("Enter count :- .\r");
        int count=sc.nextInt();
        int[] arr=readIntegers(count);
        System.out.println("Minimum number is= "+findMin(arr));
    }
}
