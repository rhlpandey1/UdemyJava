package udemy.arrays;

import java.util.Set;
import java.util.TreeSet;

public class SumOfTwoElementsEqualsTarget {
    public static void main(String[] args) {
        int []arr={1, 5,7, 9, 5};
        Set s=new TreeSet();
        int target=14;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    s.add(arr[i]);
                    s.add(arr[j]);
                   // System.out.println("Sum is equal to the target value and the numbersare"+arr[i]+" and"+arr[j]);
                    break;
                }
            }
        }
        System.out.println(s);
    }
}
