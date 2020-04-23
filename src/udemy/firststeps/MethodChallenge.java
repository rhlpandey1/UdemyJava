package udemy.firststeps;

public class MethodChallenge {
    public static void displayHigScorePosition(String playerName,int position)
    {
        System.out.println(playerName +"  managed to get position "+ position +" on the high score table");
    }
    public static int calculateHighScorePosition(int playerScore)
    {
        /*if(playerScore>=1000)
            return 1;
        else if(playerScore>=500)
            return 2;
        else if(playerScore>=100)
            return 3;
        return 4;*/
        //we should follow the following coding standard
        int position=4;
        if(playerScore>=1000)
            position=1;
        else if(playerScore>=500)
            position=2;
        else if(playerScore>=100)
            position=3;
        return position;

    }

    public static void main(String[] args) {

        int pos=calculateHighScorePosition(1000);
        displayHigScorePosition("Rahul",pos);
    }
}
