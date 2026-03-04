package lab2.Problem1c;

import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        HashSet<Device> set = new HashSet<Device>();
        Device d1 = new Device("Apple", "iPhone 15");
        Device d2 = new Device("Apple", "iPhone 15");
        Laptop l1 = new Laptop("Lenovo", "ThinkPad", "i7");
        Laptop l2 = new Laptop("Lenovo", "ThinkPad", "i7");
        Laptop l3 = new Laptop("Lenovo", "ThinkPad", "i5");
        set.add(d1);
        set.add(d2);
        set.add(l1);
        set.add(l2);
        set.add(l3);

        System.out.println("HashSet size= " + set.size());
        System.out.println(set);
    }
}