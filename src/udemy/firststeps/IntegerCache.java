package udemy.firststeps;

public class IntegerCache {
    //between -127 and +128 the reference is same
    public static void main(String[] args) {
        Integer a=Integer.valueOf(127);
        Integer b=Integer.valueOf(127);
        System.out.println(a==b);
    }
}
