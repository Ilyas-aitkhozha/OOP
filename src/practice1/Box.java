package practice1;

import java.util.Scanner;

public class Box {
    public static void main(String[] arg){
        System.out.println("Give me your name: ");
        String name = inputValue();
        String result = makeBox(name);
        System.out.println(result);
    }
    public static String inputValue(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public static String makeBox(String value){
        int len = value.length();
        System.out.println("+"+"-".repeat(len)+"+");
        System.out.println("|"+value+"|");
        return "+"+"-".repeat(len)+"+";
    }
}
