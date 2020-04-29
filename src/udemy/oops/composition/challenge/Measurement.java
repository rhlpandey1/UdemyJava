package udemy.oops.composition.challenge;

public class Measurement {
    private int height;
    private int length;
    private int width;

    public Measurement(int height, int length, int width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
    public void paint(String color){
        System.out.println("Paint in color  "+color);
    }
}
