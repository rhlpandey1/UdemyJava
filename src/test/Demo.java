package test;

public class Demo {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        //4,3,2,1
        int temp=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

        }
        //1,2,4,5

        for(int i=0;i<arr.length/2;i++){
                temp=arr[i];
                arr[i]=arr[arr.length-(i+1)];
                arr[arr.length-(i+1)]=temp;
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
