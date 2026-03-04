package lab2.Problem4;

public class Parallel extends Circuit {
    private Circuit c1;
    private Circuit c2;
    public Parallel(Circuit c1, Circuit c2) {
        this.c1 = c1;
        this.c2 = c2;
    }
    @Override
    public double getResistance() {
        double r1 = c1.getResistance();
        double r2 = c2.getResistance();
        if (r1 == 0 || r2 == 0) return 0;
        return 1.0 / (1.0 / r1 + 1.0 / r2);
    }

    @Override
    public void applyPotentialDiff(double v) {
        this.potentialDiff = v;
        c1.applyPotentialDiff(v);
        c2.applyPotentialDiff(v);
    }
    @Override
    public String toString() {
        return "Parallel(V=" + potentialDiff + ", R=" + getResistance() + ", [" + c1 + ", " + c2 + "])";
    }
}
