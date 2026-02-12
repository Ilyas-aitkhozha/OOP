package practice3;

public class Animal {
    protected String name;

    public Animal(){
        System.out.println("Animal created");
    }
    public Animal(String name){
        this.name = name;
        System.out.println("Animal name:" + name);
    }
    public void makeSound(){
        System.out.println("Animal make sound");
    }
    public void eat(){
        System.out.println("Animal eats food");
    }
    public void eat(String food){
        System.out.println("Animal eats " + food);
    }
}

