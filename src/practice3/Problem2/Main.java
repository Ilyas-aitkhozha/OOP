package practice3.Problem2;
import java.util.Vector;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Person> people = new Vector<Person>();

        while (true) {
            System.out.println("1 - Add person");
            System.out.println("2 - Print all");
            System.out.println("0 - Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 0) {
                break;
            }
            if (choice == 1) {
                System.out.println("1 - Person");
                System.out.println("2 - Student");
                System.out.println("3 - Staff");
                System.out.print("Choose type: ");
                int type = sc.nextInt();
                sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Address: ");
                String address = sc.nextLine();
                if (type == 1) {
                    Person p = new Person(name, address);
                    people.add(p);
                }
                if (type == 2) {
                    System.out.print("Program: ");
                    String program = sc.nextLine();
                    System.out.print("Year: ");
                    int year = sc.nextInt();

                    System.out.print("Fee: ");
                    double fee = sc.nextDouble();
                    sc.nextLine();
                    Student s = new Student(name, address, program, year, fee);
                    people.add(s);
                }

                if (type == 3) {
                    System.out.print("School: ");
                    String school = sc.nextLine();
                    System.out.print("Pay: ");
                    double pay = sc.nextDouble();
                    sc.nextLine();

                    Staff st = new Staff(name, address, school, pay);
                    people.add(st);
                }
            }
            if (choice == 2) {
                for (int i = 0; i < people.size(); i++) {
                    System.out.println(people.get(i));
                }
            }
        }
        sc.close();
    }
}

