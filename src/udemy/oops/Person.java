package udemy.oops;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0||age>100)
            this.age=0;
        else
            this.age = age;
    }
    public boolean isTeen(){
        if(getAge()>12 && getAge()<20)
            return true;
        else
            return false;
    }
    public String getFullName(){
        if(getFirstName().isEmpty() && getLastName().isEmpty())
            return "";
        else if(getLastName().isEmpty())
            return getFirstName();
        else if(getFirstName().isEmpty())
            return getLastName();
        else
            return getFirstName()+" "+getLastName();
    }

    public static void main(String[] args) {
        Person person=new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("fullName= "+person.getFullName());
        System.out.println("teen= "+person.isTeen());
        person.setFirstName("john");
        person.setAge(18);
        System.out.println("fullName= "+person.getFullName());
        System.out.println("teen= "+person.isTeen());
        person.setLastName("smith");
        System.out.println("fullName= "+person.getFullName());
    }
}
