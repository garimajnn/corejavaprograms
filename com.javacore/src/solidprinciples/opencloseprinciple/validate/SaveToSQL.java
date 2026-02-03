package solidprinciples.opencloseprinciple.validate;


public class SaveToDB implements DBPersistence {
public void save(String  product){
    System.out.println("save to db");
}
}
