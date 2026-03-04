package lab2.Problem4;

public abstract class Circuit {
    protected double potentialDiff;
    public abstract double getResistance();
    public double getPotentialDiff() {
        return potentialDiff;
    }
    public abstract void applyPotentialDiff(double v);
    public double getCurrent() {
        double r = getResistance();
        if (r == 0) return 0;
        return getPotentialDiff() / r;
    }
    public double getPower() {
        double v = getPotentialDiff();
        double r = getResistance();
        if (r == 0) return 0;
        return (v * v) / r;
    }
}