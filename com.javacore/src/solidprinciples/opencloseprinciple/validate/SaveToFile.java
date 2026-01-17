package solidprinciples.opencloseprinciple.validate;

import solidprinciples.singleresponsibility.srpvalidate.ShoppingCart;

public class SaveToFile implements DBPersistence {
public void save(ShoppingCart cart){
    System.out.println("save to file");
}
}
