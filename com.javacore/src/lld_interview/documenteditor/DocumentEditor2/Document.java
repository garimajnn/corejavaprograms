package lld_interview.documenteditor.DocumentEditor2;

import lld_interview.documenteditor.DocumentEditor2.DocumentElement.DocumentElement;

import java.util.ArrayList;
import java.util.List;

public class Document {
    private List<DocumentElement> documentElementList;
    public Document(){
        documentElementList=new ArrayList<>();
    }
    void addElement(DocumentElement element){
        documentElementList.add(element);
    }
    public String  renderElement(){
       StringBuilder renderedData=new StringBuilder("");
        for(DocumentElement doc:documentElementList){
          String rendereddocs=doc.render();
            System.out.println(rendereddocs);
          renderedData.append(rendereddocs);
        }
        return renderedData.toString(); 
    }
}
