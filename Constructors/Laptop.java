public class Laptop {
    private String brand;
    private String color;
    private double ram;

    public Laptop(String brand, String color, double ram) {
        this.brand = brand;
        this.color = color;
        this.ram = ram;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setRam(double ram) {

    }
}
