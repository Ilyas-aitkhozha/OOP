package practice3;

public class Main {
    public static void main(String[] args) {

        Dog d1 = new Dog();
        System.out.println();

        Dog d2 = new Dog("Rikky", "mops");
        System.out.println();

        d2.makeSound();
        d2.eat();
        d2.eat("meat");
        d2.eat(3);
    }
}

