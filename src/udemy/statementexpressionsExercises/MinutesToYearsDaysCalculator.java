package udemy.statementexpressionsExercises;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes)
    {
        if(minutes<0)
            System.out.println("Invalid Value");
        else
        {
            long days=minutes/1440;
            long year=days/365;
            long remDays=days%365;
            System.out.println(minutes+" min = "+year+" y and "+remDays+" d");
        }

    }

    public static void main(String[] args) {
        printYearsAndDays(561600);
    }
}
