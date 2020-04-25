package udemy.statementexpressionsExercises;

public class DecimalComparator {
    public  static boolean areEqualByThreeDecimalPlaces(double par1,double par2)
    {

        int a = (int)(par1*1000);
        int b = (int)(par2*1000);
        if(a == b){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756,3.1757));
    }
}