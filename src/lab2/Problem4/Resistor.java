package lab2.Problem4;

public class Resistor extends Circuit {
    private double resistance;
    public Resistor(double resistance) {
        this.resistance = resistance;
        this.potentialDiff = 0.0;
    }
    @Override
    public double getResistance() {
        return resistance;
    }

    @Override
    public void applyPotentialDiff(double v) {
        this.potentialDiff = v;
    }
    @Override
    public String toString() {
        return "Resistor(R=" + resistance + ", V=" + potentialDiff + ")";
    }
}
