package practice1;

import java.util.Scanner;

public class Quadratic {
    public static void main(String []args){
        System.out.println("Give me a b and c");
        int a,b,c;
        String[] values = inputValue();
        a = Integer.parseInt(values[0]);
        b = Integer.parseInt(values[1]);
        c = Integer.parseInt(values[2]);
        double discVal = discriminant(a,b,c);
        System.out.println(res(discVal,a,b));
    }
    public static String[] inputValue(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().split(" ");
    }
    public static double discriminant(int a, int b, int c){
        return b*b - 4*a*c;
    }
    public static String res(double discVal, int a, int b){
        if(discVal<0){
            return "No solution";
        }
        else if(discVal == 0){
            return "Only 1 solution: "+(-1*b/2*a);
        }
        else{
            return "2 solutions "+((-1 * b + Math.sqrt(discVal)) / 2 * a) + " ; " +  ((-1 * b - Math.sqrt(discVal)) / 2 * a);
        }
    }

}
