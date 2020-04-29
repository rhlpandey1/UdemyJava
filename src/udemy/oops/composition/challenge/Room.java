package udemy.oops.composition.challenge;



public class Room {
    private int noOfWindows;
    private String wallColor;
    private int noOfLights;
    private Measurement measurement;

    public Room(int noOfWindows, String wallColor, int noOfLights, Measurement measurement) {
        this.noOfWindows = noOfWindows;
        this.wallColor = wallColor;
        this.noOfLights = noOfLights;
        this.measurement = measurement;
    }
    public void useColor(){
        getColor();
    }
    public int getNoOfWindows() {
        return noOfWindows;
    }

    public String getWallColor() {
        return wallColor;
    }

    public int getNoOfLights() {
        return noOfLights;
    }

    private  Measurement getMeasurement() {
        return measurement;
    }

    private void getColor(){
        measurement.paint("Red");
    }
}
