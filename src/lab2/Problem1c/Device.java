package lab2.Problem1c;
import java.util.Objects;

public class Device {
    private String brand;
    private String model;
    public Device(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    @Override
    public String toString() {
        return "Device brand=' " +brand + " ', model='"+model + "')";
    }
    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (this == o) return true;
        if (this.getClass() != o.getClass()) return false;

        Device device = (Device) o;
        return Objects.equals(brand, device.brand) &&
                Objects.equals(model, device.model);
    }
    @Override
    public int hashCode() {
        return Objects.hash(brand, model);
    }
}
