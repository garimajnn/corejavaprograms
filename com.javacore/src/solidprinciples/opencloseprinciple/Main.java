package solidprinciples.opencloseprinciple;

import solidprinciples.opencloseprinciple.breakes.ShoppingStorage;
import solidprinciples.opencloseprinciple.validate.DBPersistence;
import solidprinciples.opencloseprinciple.validate.SaveToMongoDB;

public class Main {
    public static void main(String[] args) {
        ShoppingStorage mongodb=new ShoppingStorage();
        String product="saree";
        mongodb.saveToDb(product);

        // OCP

        DBPersistence db=new SaveToMongoDB();
        db.save(product);

    }

}
