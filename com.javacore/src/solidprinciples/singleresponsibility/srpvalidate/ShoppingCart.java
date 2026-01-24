package solidprinciples.singleresponsibility.srpvalidate;

import java.util.ArrayList;
import java.util.List;

// Violating SRP : ShoppingCart is handling multiple responsibilities

public class ShoppingCart{

    private List<Product> productList;
    public ShoppingCart(){
        productList=new ArrayList<>();
    }
    public void  addProduct(Product product){
        productList.add(product);
    }
    public List<Product> getProductList(){
        return productList;
    }
    // 1. Calculate total price of cart
    public  double calculateTotal(){
        double totalPrice=0;
        for(Product product:productList){
            totalPrice+=product.productPrice;
        }
        return totalPrice;
    }
    // 2. Voilating SRP - Prints invoice (Should be in a separate class)

    // 3. Voilating SRP - Saves to DB (Should be in a separate class)




}