package ro.raul.products;

public class Electronics extends Product {
    private final String type;
    private final double length;
    private final double width;
    private final double height;
    private final double weight;

    public Electronics(double price, String name, String description, String type, double length, double width, double height, double weight) {
        super(price, name, description);
        this.type = type;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
}
