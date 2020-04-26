package udemy.oops;

public class Wall {
    private double width;
    private double height;

    public Wall() {
    }

    public Wall(double width, double height) {
        if(width<0.0)
            width=0.0;
        else
            this.width=width;
        if(height<0.0)
            height=0.0;
        else
            this.height=height;

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width<0.0)
            this.width=0.0;
        else
            this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height<0.0)
            this.height=0;
        else
            this.height = height;
    }
    public double getArea(){
        return getHeight()*getWidth();
    }

    public static void main(String[] args) {
        Wall wall=new Wall(5,4);
        System.out.println(wall.getArea());
        wall.setHeight(-1.5);
        System.out.println(wall.getHeight());
        System.out.println(wall.getWidth());
        System.out.println(wall.getArea());
    }
}
