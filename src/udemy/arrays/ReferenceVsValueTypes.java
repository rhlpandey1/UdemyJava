package udemy.arrays;

import java.util.Arrays;

public class ReferenceVsValueTypes {
    public static void main(String[] args) {
        int myIntValue=10;
        int anotherIntValue=myIntValue;
        System.out.println("myIntValue ="+myIntValue);
        System.out.println("anotherIntValue ="+anotherIntValue);
        anotherIntValue++;
        System.out.println("myIntValue ="+myIntValue);
        System.out.println("anotherIntValue ="+anotherIntValue);

        int[] myIntArray=new int[5];
        int[] anotherIntArray=myIntArray;
        System.out.println("myIntArray = "+ myIntArray);
        System.out.println("myIntArray = "+ Arrays.toString(myIntArray));
        System.out.println("anotherIntArray = "+Arrays.toString(anotherIntArray));

        anotherIntArray[0]=1;
        //As both are referring to same memory location after adding in one reference other also will increase
        System.out.println("After change myIntArray = "+ Arrays.toString(myIntArray));
        System.out.println("After change anotherIntArray = "+Arrays.toString(anotherIntArray));
        //now anotherInArray will refer different object
        anotherIntArray=new int[]{5,6,7,8,9};
        modifyArray(myIntArray);
        System.out.println("After modify myIntArray = "+ Arrays.toString(myIntArray));
        System.out.println("After modify anotherIntArray = "+Arrays.toString(anotherIntArray));
    }
    private static void modifyArray(int[] arr){
        arr[0]=2;
        //de referencing the array
        arr=new int[]{1,2,3,4,5};
    }
}
