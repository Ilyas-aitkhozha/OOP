package lab2.Problem1c;

import java.util.Objects;

public class Laptop extends Device {
    private String cpu;

    public Laptop(String brand, String model, String cpu) {
        super(brand, model);
        this.cpu = cpu;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "Laptop(" + getBrand() + ", " + getModel() + ", cpu='" + cpu + "')";
    }
    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (this == o) return true;
        if (this.getClass() != o.getClass()) return false;

        Laptop laptop = (Laptop) o;
        return super.equals(laptop) && Objects.equals(cpu, laptop.cpu);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cpu);
    }
}
