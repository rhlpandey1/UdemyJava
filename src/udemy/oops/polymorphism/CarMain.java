package udemy.oops.polymorphism;

 class Car {
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

     public Car(int cylinders,String name) {
        this.name=name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }
     public String getName() {
         return name;
     }
    public String startEngine(){
        return getClass().getSimpleName()+"->startEngine()";
    }
    public String accelerate(){
        return getClass().getSimpleName()+"->accelerate()";
    }
    public String brake(){
        return getClass().getSimpleName()+"->brake()";
    }
}
class Mercedes extends Car{
   private String model;

    public Mercedes(int cylinders, String name, String model) {
        super(cylinders, name);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName()+"->startEngine()";

    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName()+"->accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName()+"->brake()";
    }
}
class Ferrari extends Car{
    private String model;

    public Ferrari(int cylinders, String name, String model) {
        super(cylinders, name);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName()+"->startEngine()";

    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName()+"->accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName()+"->brake()";
    }
}
public class CarMain{
    public static void main(String[] args) {
        Car car;
        car=new Car(8,"Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
        car=new Mercedes(3,"V class","GLE");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
        car=new Ferrari(3,"Sports edition","812");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());


    }
}
