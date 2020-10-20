package oracleTest;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr={0,4,22,4,14,4,2};
        for(int i=0;i<arr.length;i+=2){
            if(arr[i+1]>arr[i]&&arr[i+1]<arr[i+2]){
                System.out.println(true);
            }

        }
    }
}
