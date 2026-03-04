package lab2.Problem1a;

public class Cylinder extends Shape3D {
    private double radius;
    private double height;
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double volume() {
        return Math.PI * radius * radius * height;
    }
    @Override
    public double surfaceArea() {
        return 2* Math.PI * radius *radius +2 * Math.PI * radius * height;
    }
    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }
    @Override
    public String toString() {
        return "Cylinderradius=" + radius + "height=" + height + super.toString();
    }
}
