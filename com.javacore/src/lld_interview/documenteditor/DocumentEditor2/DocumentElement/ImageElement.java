package lld_interview.documenteditor.DocumentEditor2.DocumentElement;

public class ImageElement implements DocumentElement{
    String imagePath;
    public ImageElement(String imagePath){
        this.imagePath=imagePath;
    }
    public String render(){
       return "Image Path - [imagePath]";
    }

}
