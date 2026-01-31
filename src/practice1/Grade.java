package practice1;
import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("give ur score (0-100): ");
        int score = scanner.nextInt();

        if (score >= 95 && score <= 100) {
            System.out.println("Grade: A");
        } else if (score >= 90) {
            System.out.println("Grade: A-");
        } else if (score >= 85) {
            System.out.println("Grade: B+");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 75) {
            System.out.println("Grade: B-");
        } else if (score >= 70) {
            System.out.println("Grade: C+");
        } else if (score >= 65) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: C-");
        } else if (score >= 55) {
            System.out.println("Grade: D+");
        } else if (score >= 50) {
            System.out.println("Grade: D");
        } else if (score >= 0) {
            System.out.println("Grade: F");
        } else {
            System.out.println("not valid");
        }
        scanner.close();
    }
}
