package ro.raul.products;

public abstract class Product {
    private final String name;
    private final String description;
    private final int quantity;
    private double price;

    public Product(double price, String name, String description) {
        this.price = price;
        this.name = name;
        this.description = description;
        this.quantity = 1;
    }


    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }


    @Override
    public String toString() {
        return getClass().getSimpleName() + "->" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                " ";
    }
}


