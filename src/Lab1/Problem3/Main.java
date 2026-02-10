package Lab1.Problem3;

public class Main {
    public static void main(String[] args){
        Temperature t1=new Temperature(0,'C');
        System.out.println(t1.getCelcius());
        System.out.println(t1.getFahrenheit());
        Temperature t2 = new Temperature('F');
        System.out.println(t2.getCelcius());
        System.out.println(t2.getFahrenheit());
    }
}
