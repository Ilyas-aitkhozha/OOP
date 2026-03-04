package lab2.Problem4;

public class Series extends Circuit {
    private Circuit c1;
    private Circuit c2;
    public Series(Circuit c1, Circuit c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public double getResistance() {
        return c1.getResistance() + c2.getResistance();
    }

    @Override
    public void applyPotentialDiff(double v) {
        this.potentialDiff = v;

        double rTotal = getResistance();
        if (rTotal == 0) return;
        double current = v / rTotal;
        double v1 = current * c1.getResistance();
        double v2 = current * c2.getResistance();

        c1.applyPotentialDiff(v1);
        c2.applyPotentialDiff(v2);
    }
    @Override
    public String toString() {
        return "Series(V=" + potentialDiff + ", R=" + getResistance() + ", [" + c1 + ", " + c2 + "])";
    }
}