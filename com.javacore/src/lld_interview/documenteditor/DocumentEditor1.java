package lld_interview.documenteditor;

import java.util.ArrayList;
import java.util.List;

public class DocumentEditor1 {

    List<String> element;
    public DocumentEditor1(){
        element=new ArrayList<>();
    }
    public void addText(String text){
        element.add(text);
    }
    public void addImage(String imagePath){
        element.add(imagePath);
    }
    void renderElements(){
        for(String data:element){
            System.out.println(data);
        }
    }
    void saveToDb(){
        System.out.println("Saving data to DB");
    }

    public static void main(String[] args) {
        DocumentEditor1 editor=new DocumentEditor1();
        editor.addText("Hello I m Garima");
        editor.addText("I m from Sironj");
        editor.addImage("Garima.jpg");
        editor.renderElements();
        editor.addText("Good Bye");
        editor.renderElements();
    }
}

