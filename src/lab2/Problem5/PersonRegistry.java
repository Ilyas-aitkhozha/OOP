package lab2.Problem5;

import java.util.ArrayList;

public class PersonRegistry {
    private ArrayList<Person> people;

    public PersonRegistry() {
        people = new ArrayList<Person>();
    }
    public void addPerson(Person person) {
        if (person == null) return;
        people.add(person);
    }
    public boolean removePerson(Person person) {
        return people.remove(person);
    }
    public ArrayList<Person> findPeopleWithPets() {
        ArrayList<Person> result = new ArrayList<Person>();
        int i;
        for (i = 0; i < people.size(); i++) {
            if (people.get(i).hasPet()) {
                result.add(people.get(i));
            }
        }
        return result;
    }
    public ArrayList<Person> findPeopleWithoutPets() {
        ArrayList<Person> result = new ArrayList<Person>();
        int i;
        for (i = 0; i < people.size(); i++) {
            if (!people.get(i).hasPet()) {
                result.add(people.get(i));
            }
        }
        return result;
    }
    @Override
    public String toString() {
        return "Registry: " + people;
    }
}
