package lab2.Problem4;

public class Test {
    public static void main(String[] args) {
        Circuit a = new Resistor(3.0);
        Circuit b = new Resistor(3.0);
        Circuit c = new Resistor(6.0);
        Circuit d = new Resistor(3.0);
        Circuit e = new Resistor(2.0);

        Circuit f = new Series(a, b);
        Circuit g = new Parallel(c, d);
        Circuit h = new Series(g, e);
        Circuit circuit = new Parallel(h, f);
        System.out.println("Total Resistanc = " + circuit.getResistance());
        circuit.applyPotentialDiff(12.0);
        System.out.println("Total V = " + circuit.getPotentialDiff());
        System.out.println("Total I= " + circuit.getCurrent());
        System.out.println("Total Powr = " + circuit.getPower());

        System.out.println(circuit);
    }
}
