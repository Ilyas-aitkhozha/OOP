package practice1;
import java.util.Scanner;
public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("give side: ");
        double a = scanner.nextDouble();

        double area = a * a;
        double perimeter = 4 * a;
        double diagonal = a * Math.sqrt(2);

        System.out.println("area: " + area);
        System.out.println("perimeter: " + perimeter);
        System.out.println("diagonal: " + diagonal);

        scanner.close();
    }
}

