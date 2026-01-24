package solidprinciples.singleresponsibility.srpvoilates;

import java.util.List;

// Violating SRP : ShoppingCart is handling multiple responsibilities

public class ShoppingCart{

   private List<Product> productList;
   public void  addProduct(Product product){
       productList.add(product);
   }
   public List<Product> getProductList(){
       return productList;
   }
   // 1. Calculate total price of cart
   public  double calculateTotal(){
       double totalPrice=0;
       for(solidprinciples.singleresponsibility.srpvoilates.Product product:productList){
           totalPrice+=product.productPrice;
       }
       return totalPrice;
   }
   // 2. Voilating SRP - Prints invoice (Should be in a separate class)
   void printInvoice(){
        System.out.println("Shopping  Cart Invoice");
       for(Product product:productList){
           System.out.println(product.productName +"  "+product.productPrice);
       }
       System.out.println("total price" + calculateTotal()  );
    }
    // 3. Voilating SRP - Saves to DB (Should be in a separate class)
    void saveToDb(){
        System.out.println("saving to db");
    }



}