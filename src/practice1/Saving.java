package practice1;

import java.util.Scanner;
public class Saving {
    public static void main(String []args){
        String[] parts = inValue();
        float balance = Float.parseFloat(parts[0]);
        float percent = Float.parseFloat(parts[1]);
        int years = Integer.parseInt(parts[2]);
        float res = calc(balance,percent,years);
        System.out.println("New balance after " + years + " years: " + Math.round(res));
    }
    public static String[] inValue(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter balance interestrate and years for example: 1000 5 3: ");
        return scanner.nextLine().split(" ");
    }
    public static Float calc(float balance, float percent, int years){
        for(int i = 0; i < years; i++){
            balance = balance * (1+percent/100);
        }
        return balance;
    }
}
