package oops;

import oops.product.Electronics;
import oops.product.Product;

public class ShoppingFacade {
  private  Cart cart;
    public ShoppingFacade() {
        Cart cart = new Cart();

    }
    public void shop(){
        Product product1 = new Electronics("Charger", 3212);
        cart.addToCart(product1);
    }

}
