package udemy.firststeps;

public class MethodDemo {
    public static int finalScore;
    public static int calculateScore(boolean gameOver,int score,int levelCompleted,int bonus)
    {
        if(gameOver)
        {
            finalScore=score+(levelCompleted*bonus);
            finalScore+=2000;
            return finalScore;
        }
        return -1;
    }
    public static void main(String[] args) {
        int fScore=calculateScore(false,800,5,100);
        System.out.println("Final score is :->"+fScore);
    }
}
