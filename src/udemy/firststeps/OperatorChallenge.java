package udemy.firststeps;

public class OperatorChallenge {
    public static void main(String[] args) {

        double d1=20.00D;
        System.out.println(d1);
        double d2=80.00D;
        System.out.println(d2);
        double res=(d1+d2)*100.00d;
        System.out.println(res);
        double rem=res%40.00d;
        System.out.println(rem);
        boolean check=(rem==0)?true:false;
        System.out.println(check);
        if(!check)
            System.out.println("Got some reminder");

    }
}
