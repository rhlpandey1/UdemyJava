package udemy.oops;

public class Main {

    public static void main(String[] args) {
	    Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");
        dog.eat();
        
        /*Ferrari ferrari = new Ferrari(36);
        ferrari.steer(45);
        ferrari.accelerate(30);
        ferrari.accelerate(20);
        ferrari.accelerate(-42);
        Car car=new Car("BMW","34",4,4,5,false);
        car.changeVelocity(50,4);*/
        Circle circle=new Circle(3.75);
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
        Cylinder cylinder=new Cylinder(5.55,7.25);
        System.out.println(cylinder.getRadius());
        System.out.println(cylinder.getHeight());
        System.out.println(cylinder.getArea());
        System.out.println(cylinder.getVolume());
    }
}
