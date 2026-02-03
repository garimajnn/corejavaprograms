package solidprinciples.dependencyinversion.voilate;

public class MySQLdatabase {
    void saveToSQL(String data){
        System.out.println("saving data to  sql");
    }

}
class MongoDb{
    void saveToMongo(String data){
        System.out.println("saving data to mongodb");
    }
}

// here voilating OCP as well
// tightly couple hai yeh
class UserService{
    MySQLdatabase sqlDb;
    MongoDb mongoDb;
    void storeUserToSQL(String data){
        sqlDb.saveToSQL(data);
    }
    void storeUserToMongodb(String data){
        mongoDb.saveToMongo(data);
    }
}


// If tomoroww casssandra m store krna hai toh userservice k logic bhi change hoga
// here client should be aware about interface only not about concrete classes