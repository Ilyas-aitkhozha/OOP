package Lab1.Problem1;
import java.util.Scanner;
public class Analyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number (Q to quit) ");
        Data data = new Data();
        while(true) {
            String in = scanner.nextLine();
            if(in.equalsIgnoreCase("Q")){
                break;
            }
            if (in.isEmpty()) {
                System.out.println(". Please no inpuxt enter a number or Q.");
                continue;
            }
            try {
                double value = Double.parseDouble(in);
                data.add(value);}
            catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or Q.");
            }
        }
        System.out.println("Average = " + data.getAvg());
        System.out.println("Maximum = " + data.getMax());
        scanner.close();
    }
}
