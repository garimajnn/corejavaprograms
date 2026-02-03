package lld_interview.documenteditor.DocumentEditor2.Database;

import lld_interview.documenteditor.DocumentEditor2.DocumentElement.DocumentElement;

import java.util.List;

public class SaveToDB implements PersistenceDB {
    public void save(String docs){
        System.out.println("Saving data to DB" + docs);
    }
}
