package solidprinciples.dependencyinversion.validate;

interface Database {
    void save(String data);
}
class MySQLDatabase implements  Database{
    public void save(String data){
        System.out.println("saving data to mysql");
    }
}
class MongoDbDatabase implements Database{
    public void save(String data){
        System.out.println("saving data to monogdb");
    }
}

// now this is loosely coupled
class UserService{
    Database db;
    public UserService(Database database){
        db=database;
    }
    void saveToDb(String data){
        db.save(data);
    }
}

