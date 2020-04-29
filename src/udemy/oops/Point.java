package udemy.oops;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double distance(){
        return Math.sqrt(((0-x)*(0-x))+((0-y)*(0-y)));
    }
    public double distance(int a,int b){
        return Math.sqrt(((a-x)*(a-x))+((b-y)*(b-y)));
    }
    public double distance(Point point1){
        return Math.sqrt(((point1.x-this.x)*(point1.x-this.x))+((point1.y-this.y)*(point1.y-this.y)));
    }

    public static void main(String[] args) {
        Point first=new Point(6,5);
        Point second=new Point(3,1);
        System.out.println("distance(0,0)"+first.distance());
        System.out.println("distance(second)"+first.distance(second));
        System.out.println(first.distance(2,2));
        Point point=new Point();
        System.out.println(point.distance());
    }
}
