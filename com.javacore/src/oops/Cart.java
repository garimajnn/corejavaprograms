package oops;



import java.util.ArrayList;
import java.util.List;
import oops.product.Product;

//Encapsulation means keeping data safe inside a class
//and only allowing access through specific methods.

// Abstraction :- dont know about the internal details
// showing only essential information
public class Cart {
    private List<Product> productList;

    public Cart(){
        productList=new ArrayList<>();
    }

    public List<Product> getProductList() {
        return productList;
    }


    void addToCart(Product product){
        // updating the db
        // calculating offers
        // calculating bills
        // total payment
        productList.add(product);
        System.out.println("Successfully added product !" + product);
    }

}


//“Abstraction in a shopping website means identifying the main
// components and functionalities—like products, payment,
// user accounts, and the shopping cart.
// It’s about defining what the system should do,
// such as allowing users to add products to their cart or
// make payments, without exposing the internal details
// of how these actions are performed.”


// “Encapsulation is about how these functionalities are
// implemented and protected. For example, the shopping cart’s
//internal list of products is kept private, and users interact
// with it only through specific methods like addProduct() or
// getTotal(). This ensures that the internal data and logic
// are safe from unauthorized access or accidental modification.”

/**
        Online Payment:
        When you pay online, you just see “Order placed successfully.”
        You don’t see how the database is updated, how the order is processed, or how the shipping team is notified.
        All those details are hidden from you.
        This is abstraction.
 */

/**
        Add to Cart:
        You click “Add to Cart” and see a message, but you don’t see how the product is added to the cart, how the price is calculated, or how the database is updated.
        All the behind-the-scenes work is hidden.
        This is abstraction.
 */