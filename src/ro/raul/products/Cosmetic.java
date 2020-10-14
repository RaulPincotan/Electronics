package ro.raul.products;

public class Cosmetic extends Product {
    private final String color;
    private final int weight;

    public Cosmetic(double price, String name, String description, String color, int weight) {
        super(price, name, description);
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return super.toString() + ", color: " + color + ", weight " + weight;
    }
}
