package solidprinciples.opencloseprinciple.validate;


public class SaveToSQL implements DBPersistence {
public void save(String  product){
    System.out.println("save to sql" + product);
}
}
