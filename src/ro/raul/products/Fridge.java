package ro.raul.products;

public class Fridge extends Electronics {
    private double temperature;

    public Fridge(double price, String name, String description, String type, double length, double width, double height, double weight, double temperature) {
        super(price, name, description, type, length, width, height, weight);
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }
}
