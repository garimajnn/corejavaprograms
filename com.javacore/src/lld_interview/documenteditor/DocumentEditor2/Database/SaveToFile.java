package lld_interview.documenteditor.DocumentEditor2.Database;

import lld_interview.documenteditor.DocumentEditor2.DocumentElement.DocumentElement;

import java.util.List;

public class SaveToFile implements PersistenceDB {
    public void  save(String docs){
        System.out.println("Saving docs to file"+docs);
    }
}
