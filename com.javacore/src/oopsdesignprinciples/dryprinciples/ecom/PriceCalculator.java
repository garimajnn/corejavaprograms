package oopsdesignprinciples.dryprinciples.ecom;


import oops.product.Product;

import java.util.List;

// Let's say I want to calculate price in multiple place like cart,
// order summary,invoice,etc ...


public class PriceCalculator
{
    public double calculatePrice(List<Product> allProducts){
        double total=0;
        for(Product product:allProducts){
              total+=product.getPrice();
        }
        // tax logic,discount etc...
        return total;
    }
}
