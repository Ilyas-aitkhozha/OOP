package lab2.Problem5;

public abstract class Animal {
    private String name;
    private int age;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract String getSound();
    public String getType() {
        return this.getClass().getSimpleName();
    }
    @Override
    public String toString() {
        return getType() + "name'" + name + "', age" + age + ", sound=" + getSound() + "'";
    }
}