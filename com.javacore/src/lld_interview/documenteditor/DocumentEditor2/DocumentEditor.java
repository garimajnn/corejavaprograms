package lld_interview.documenteditor.DocumentEditor2;

import lld_interview.documenteditor.DocumentEditor2.Database.PersistenceDB;
import lld_interview.documenteditor.DocumentEditor2.Database.SaveToFile;
import lld_interview.documenteditor.DocumentEditor2.DocumentElement.DocumentElement;
import lld_interview.documenteditor.DocumentEditor2.DocumentElement.ImageElement;
import lld_interview.documenteditor.DocumentEditor2.DocumentElement.TextElement;

import java.util.ArrayList;
import java.util.List;

public class DocumentEditor {


    Document doc;
    PersistenceDB db;
    String renderedElements;
    DocumentEditor(Document doc,PersistenceDB db){
        this.db=db;
        this.doc=doc;

    }
    void addImage(String path){
        doc.addElement(new ImageElement(path));
    }
    void addText(String text){
        doc.addElement(new TextElement(text));
    }
    void renderDoc(){
         renderedElements=doc.renderElement();
    }
    void save(){
        db.save(renderedElements);
    }

    public static void main(String[] args) {
        Document doc=new Document();
        PersistenceDB db=new SaveToFile();
        DocumentEditor editor=new DocumentEditor(doc,db);
        editor.addText("Hey I m Garima");
        editor.renderDoc();
        editor.save();

    }
}
