package udemy.arrays;

import java.util.Arrays;

public class ReverseArrayChallenge {
    public static int[] reverse(int[] arr){
        int temp;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        return arr;
    }
    public static int[] reverseInSingleLoop(int[] arr){
        int temp;
        //we are iterating till half of the loop since either for odd or even number of elements
        //in the array we need to swap till the half only
        for(int i=0;i<arr.length-1/2;i++){
                temp=arr[i];
                arr[i]=arr[arr.length-(i+1)];
                arr[arr.length-(i+1)]=temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int ar[]={1,2,3,4,5};
        int[] arr=reverse(ar);
        int[] arr1=reverseInSingleLoop(ar);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }
}
