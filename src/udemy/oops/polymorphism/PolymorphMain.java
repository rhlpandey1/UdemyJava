package udemy.oops.polymorphism;

public class PolymorphMain {
    class Movie{
        private String name;

        public Movie(String name) {
            this.name = name;
        }
        public String plot(){
            return "No plot here";
        }
    }
    class Jaws extends Movie{
        public Jaws(String name) {
            super("Jaws");
        }

        @Override
        public String plot() {
            return "a shark eats people";
        }
    }
    public static void main(String[] args) {

    }
}
