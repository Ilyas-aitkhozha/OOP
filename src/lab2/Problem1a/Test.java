package lab2.Problem1a;

public class Test {
    public static void main(String[] args) {
        Shape3D[] shapes = new Shape3D[3];
        shapes[0] = new Cylinder(3, 5);
        shapes[1] = new Sphere(4);
        shapes[2] = new Cube(2);
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i]);
        }
    }
}