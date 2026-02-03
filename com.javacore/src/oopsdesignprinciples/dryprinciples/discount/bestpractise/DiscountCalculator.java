package oopsdesignprinciples.dryprinciples.discount.bestpractise;

public interface DiscountCalculator {
    double applyDiscount(double amount);
}
class ShopDiscount implements DiscountCalculator{
    @Override
    public double applyDiscount(double amount) {
        return amount*12;
    }
}

class FestivalDiscount implements DiscountCalculator{
    @Override
    public double applyDiscount(double amount) {
        return amount*30;
    }
}

/**
 *
 * Don’t DRY until the duplication proves to be stable knowledge.
 *
 */