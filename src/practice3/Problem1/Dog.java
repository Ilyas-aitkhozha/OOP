package practice3.Problem1;

public class Dog extends Animal {


    public Dog() {
        super();
        System.out.println("Dog created");
    }

    public Dog(String name, String breed) {
        super(name);
        System.out.println("Breed: " + breed);
    }

    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }

    public void eat(int times) {
        System.out.println("Dog eats " + times + " times a day");
    }
}

