package lab2.Problem1a;

public abstract class Shape3D {
    public abstract double volume();
    public abstract double surfaceArea();

    @Override
    public String toString() {
        return "volume=" + volume() + ", surfaceArea=" + surfaceArea();
    }
}
