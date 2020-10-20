package oracleTest;
class Test1
{
    public Test1() {
        System.out.println("Test");
    }
}
public class InitDemo extends Test1{
    Test1 ob=new Test1();
    InitDemo(){
        System.out.println("Test1");
    }
    public static void main(String[] args) {
        System.out.println("Test2");
        new InitDemo();
    }
}
