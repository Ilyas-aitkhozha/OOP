package lab2.Problem5;

import java.util.Objects;

public abstract class Person {
    private String name;
    private int age;
    protected Animal pet;
    private Person tempCaretaker;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.pet = null;
        this.tempCaretaker = null;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public Animal getPet() {
        return pet;
    }

    public boolean hasPet() {
        return pet != null;
    }

    public void assignPet(Animal pet) {
        this.pet = pet;
    }

    public void removePet() {
        this.pet = null;
    }

    public abstract String getOccupation();

    public boolean leavePetWith(Person caretaker) {
        if (caretaker == null) return false;
        if (!hasPet()) return false;
        if (caretaker.hasPet()) return false;
        if (caretaker == this) return false;
        if (pet instanceof Dog && caretaker instanceof PhDStudent) return false;

        caretaker.assignPet(this.pet);
        this.pet = null;
        this.tempCaretaker = caretaker;
        return true;
    }

    public boolean retrievePetFrom(Person caretaker) {
        if (caretaker == null) return false;
        if (this.tempCaretaker != caretaker) return false;
        if (this.hasPet()) return false; // owner must be without pet
        if (!caretaker.hasPet()) return false;

        this.assignPet(caretaker.getPet());
        caretaker.removePet();
        this.tempCaretaker = null;
        return true;
    }
    @Override
    public String toString() {
        String petInfo = hasPet() ? pet.toString() : "no pet";
        return getOccupation() + "(name='" + name + "', age=" + age + ", " + petInfo + ")";
    }
    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (this == o) return true;
        if (this.getClass() != o.getClass()) return false;

        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
