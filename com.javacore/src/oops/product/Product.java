package oops.product;


public abstract class Product {
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // common behavior
    public double getPrice() {
        return price;
    }

    // behavior that varies by product type
    public abstract double calculateDiscount();
}
