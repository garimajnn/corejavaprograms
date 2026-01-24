package solidprinciples.singleresponsibility.srpvalidate;

import java.util.List;

public class ShoppingCartPrinter {

    // Composition - has a relation
    ShoppingCart shoppingCart=new ShoppingCart();
    List<Product> productList=shoppingCart.getProductList();

    void printInvoice(){
        System.out.println("Shopping  Cart Invoice");
        for(Product product:productList){
            System.out.println(product.productName +"  "+product.productPrice);
        }
        System.out.println("total price" + shoppingCart.calculateTotal()  );
    }
}
