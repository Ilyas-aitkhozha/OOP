package lab2.Problem5;
import java.util.Scanner;
public class Test {
    private static Person createPerson(Scanner sc, int index) {
        System.out.println("Create person #" + index);
        System.out.print("Type (1=Employee, 2=Student, 3=PhDStudent): ");
        int type = sc.nextInt();
        sc.nextLine();

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        if (type == 1) {
            System.out.print("Job title: ");
            String jobTitle = sc.nextLine();
            return new Employee(name, age, jobTitle);
        } else if (type == 2) {
            System.out.print("Major: ");
            String major = sc.nextLine();
            return new Student(name, age, major);
        } else {
            System.out.print("Research field: ");
            String field = sc.nextLine();
            return new PhDStudent(name, age, field);
        }
    }

    private static Animal createAnimal(Scanner sc) {
        System.out.print("Pet type (1=Cat, 2=Dog, 3=Bird, 4=Fish): ");
        int t = sc.nextInt();
        sc.nextLine();

        System.out.print("Pet name: ");
        String petName = sc.nextLine();

        System.out.print("Pet age: ");
        int petAge = sc.nextInt();
        sc.nextLine();

        if (t == 1) return new Cat(petName, petAge);
        if (t == 2) return new Dog(petName, petAge);
        if (t == 3) return new Bird(petName, petAge);
        return new Fish(petName, petAge);
    }

    private static void printPeople(Person[] people) {
        int i;
        for (i = 0; i < people.length; i++) {
            System.out.println((i + 1) + ") " + people[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PersonRegistry registry = new PersonRegistry();

        System.out.print("How many people? (example: 3): ");
        int n = sc.nextInt();
        sc.nextLine();

        Person[] people = new Person[n];

        int i;
        for (i = 0; i < n; i++) {
            people[i] = createPerson(sc, i + 1);
            registry.addPerson(people[i]);
        }

        System.out.println("\nAssign pet to some person");
        System.out.println("Choose owner index (1.." + n + "): ");
        printPeople(people);
        int ownerIndex = sc.nextInt();
        sc.nextLine();

        if (ownerIndex < 1 || ownerIndex > n) {
            System.out.println("Wrong index. End.");
            return;
        }

        Person owner = people[ownerIndex - 1];

        System.out.println("Now create pet for " + owner.getName());
        Animal pet = createAnimal(sc);

        owner.assignPet(pet);

        System.out.println("\nREGISTRY AFTER PET ASSIGN:");
        System.out.println(registry);

        System.out.println("\nVACATION: Leave pet with someone");
        System.out.println("Choose caretaker index (1.." + n + "), not the same as owner:");
        printPeople(people);
        int caretakerIndex = sc.nextInt();
        sc.nextLine();

        if (caretakerIndex < 1 || caretakerIndex > n) {
            System.out.println("Wrong index. End.");
            return;
        }

        Person caretaker = people[caretakerIndex - 1];

        boolean leaveOk = owner.leavePetWith(caretaker);
        System.out.println("leavePetWith result = " + leaveOk);

        System.out.println("\nREGISTRY DURING VACATION:");
        System.out.println(registry);

        System.out.println("\n--- RETURN: Retrieve pet back ---");
        boolean retrieveOk = owner.retrievePetFrom(caretaker);
        System.out.println("retrievePetFrom result = " + retrieveOk);

        System.out.println("\nREGISTRY AFTER RETURN:");
        System.out.println(registry);

        sc.close();
    }
}