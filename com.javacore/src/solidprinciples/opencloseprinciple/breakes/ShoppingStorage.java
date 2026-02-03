package solidprinciples.opencloseprinciple.breakes;


// Here class breaks open close principle here class should
// be open for extension but not for modification

// If tomorrow I want to store data in sql I need to change my source code(business logic) that's
// not ocp
// Class is open for extension but close for modification

public class ShoppingStorage {

   public void saveToDb(String data){
        System.out.println("saving data to mongodb" + data);

    }

}
