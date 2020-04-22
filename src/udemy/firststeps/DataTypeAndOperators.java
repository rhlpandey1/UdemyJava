package udemy.firststeps;

public class DataTypeAndOperators {

    public static void main(String[] args) {
        System.out.println("Java Udemy");
        System.out.println(5);
        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        System.out.println(max);
        System.out.println(max+min);
        int max1=2_147_483_647;

        byte maxByteValue=Byte.MAX_VALUE;
        byte minByteValue=Byte.MIN_VALUE;
        System.out.println(maxByteValue+" &  "+minByteValue);
        short maxShortValue=Short.MAX_VALUE;
        short minShortValue=Short.MIN_VALUE;
        System.out.println(maxShortValue+" &  "+minShortValue);

        long maxLongValue=Long.MAX_VALUE;
        long minLongValue=Long.MIN_VALUE;
        System.out.println(maxLongValue+" &  "+minLongValue);
        long l=2_147_483_647_234L;
        System.out.println("Converted long is "+l);

        //type casting
        byte newByteValue=(byte)(minByteValue/2);
        System.out.println(newByteValue);
        short newShortValue=(short)(minShortValue/2);
        System.out.println(newShortValue);

        //challenge 1
        byte b=10;
        short s=20;
        int i=50;
        int j=b+s+i;
        long longSum=50000L+(10L*j);
        System.out.println("Long sum is"+longSum);
    //float & double
        short shortSum=(short)(1000+(10*j));
        float f=5.25F;
        float myFloatValue=(5f/3f);
        System.out.println(myFloatValue);
        double myDoubleValue=(5d/3d);
        System.out.println(myDoubleValue);

        double pound=200d;
        double kg=pound*0.45359237d;
        System.out.println(kg);

        //char and boolean
        char c='D';
        char unicodeC='\u0044';
        System.out.println(c);
        System.out.println(unicodeC);
        System.out.println('\u00A9');
        //byte,short,int,long,float,double,char,boolean-> data types

        //ternary operator
        int ageOfClient=20;
        boolean isEighteenOver=(ageOfClient==20)? true:false;
        System.out.println(isEighteenOver);


    }

}
