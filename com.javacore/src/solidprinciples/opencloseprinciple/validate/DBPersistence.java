package solidprinciples.opencloseprinciple.validate;

import solidprinciples.singleresponsibility.srpvalidate
.ShoppingCart;

public interface DBPersistence
{

    void save(ShoppingCart cart);
}

