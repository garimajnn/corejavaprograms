package solidprinciples.singleresponsibility.srpvalidate;

public class ShoppingCartStorage {
    ShoppingCart cart;
    void saveToDb(){
        System.out.println("saving to db");
    }
}
