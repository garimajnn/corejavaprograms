package solidprinciples.opencloseprinciple.validate;

public class SaveToMongoDB implements DBPersistence {

public void save(String product){
    System.out.println("save to mongodb" + product);
}
}
