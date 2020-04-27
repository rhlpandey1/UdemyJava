package udemy.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseArray {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count :- .\r");
        int count = scanner.nextInt();
        int[] testArray = readIntegers(count);
        printArray(testArray);
        reverse(testArray);
        System.out.println("Reversed array is :-> "+Arrays.toString(testArray));
        //printArray(testArray);
        Integer[] arr={1,2,3};
        System.out.println(reverseUsingCollections(arr));

    }

    public static List<Integer> reverseUsingCollections(Integer[] array) {
        Collections.reverse(Arrays.asList(array));
        return Arrays.asList(array);
    }
    public static void reverse(int[] array)
    {
        int maxIndex=array.length-1;
        int halfLength=array.length/2;
        for(int i=0;i<halfLength;i++)
        {
            int temp=array[i];
            array[i]=array[maxIndex-i];
            array[maxIndex-i]=temp;
        }
    }

    public static void printArray(int[] myIntArray) {
        for (int i = 0; i < myIntArray.length; i++) {
            System.out.println("Value at  " + i + "th position is :-> " + myIntArray[i]);
        }
    }

    public static int[] readIntegers(int count) {
        int[] values = new int[count];
        System.out.println("Enter " + count + "values :.\r");
        for (int i = 0; i < count; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }
}
