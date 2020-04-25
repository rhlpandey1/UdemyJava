package udemy.statementexpressionsExercises;

public class SecondsMinutesChallenge {

    public static String getDurationString(int minutes, int seconds) {
        String result = null;
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid Value";
        }
        int hours = minutes / 60;
        int remMins = minutes % 60;
        result = hours + "h " + remMins + "m " + seconds + "s";
        return result;
    }

    public static String getDurationString(int seconds) {
        String result = null;
        if (seconds < 0)
            return "Invalid Value";
        int minutes = seconds / 60;
        int secs = seconds % 60;
        result = minutes + "m " + secs + "s";
        return getDurationString(minutes,secs);

    }

    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3600));
    }
}
