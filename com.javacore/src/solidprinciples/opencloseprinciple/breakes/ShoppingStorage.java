package solidprinciples.opencloseprinciple.breakes;


// Here class breaks open close principle here class shold be open for extension but not for modification

public class ShoppingStorage {

   public void saveToDb(){
        System.out.println("saving data to DB");
    }
    public void saveToMongoDB(){
        System.out.println("saving data to mongodb");
    }
    public void saveToFile(){
        System.out.println("saving data to file");
    }
}
