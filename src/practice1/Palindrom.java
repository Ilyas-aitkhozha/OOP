package practice1;

import java.util.Scanner;
public class Palindrom {
    public static void main(String []args){
        while (true){String value = readInput();
        String reversed = ReverseString(value);
        if(value.equals("stop")){
            System.out.println("bye bye");
            break;
        }
        if(value.equals(reversed)){
            System.out.println("This is palindrome");
        }
        else{
            System.out.println("This is not palindrome");
        }
    }}
    public static String readInput(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public static String ReverseString(String value){
        return new  StringBuilder(value).reverse().toString();
    }
}
