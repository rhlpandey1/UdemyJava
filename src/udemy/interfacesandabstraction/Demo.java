package udemy.interfacesandabstraction;

public interface Demo {
    //Only public abstract methods with/without return type are allowed inside interface
    //we need to implement all abstract methods in the implemented class
    boolean  print();
    //static and default Concrete methods are allowed in interface
    default void display(){
        System.out.println("Hello interface");
    }
    static int getSum(){
        return 1+2;
    }
}
