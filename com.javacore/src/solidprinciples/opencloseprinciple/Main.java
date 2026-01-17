package solidprinciples.opencloseprinciple;

import solidprinciples.opencloseprinciple.validate.DBPersistence;
import solidprinciples.opencloseprinciple.validate.SaveToMongoDB;
import solidprinciples.singleresponsibility.srpvalidate.Product;
import solidprinciples.singleresponsibility.srpvalidate.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Product product=new Product("saree",9989);
        ShoppingCart cart=new ShoppingCart();
        cart.addProduct(product);
        DBPersistence db=new SaveToMongoDB();
        db.save(cart);
    }

}
