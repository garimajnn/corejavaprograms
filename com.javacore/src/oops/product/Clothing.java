package oops.product;

class Clothing extends Product {

    public Clothing(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateDiscount() {
        // 20% discount on clothing
        return price * 0.20;
    }
}

