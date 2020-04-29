package udemy.oops.composition.challenge;

public class MainForRoom {
    public static void main(String[] args) {
        Measurement measurement=new Measurement(15,14,10);
        Room theRoom=new Room(3,"green",3,measurement);
        theRoom.useColor();
    }

}
