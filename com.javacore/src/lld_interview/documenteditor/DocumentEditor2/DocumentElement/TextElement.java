package lld_interview.documenteditor.DocumentEditor2.DocumentElement;

public class TextElement implements DocumentElement{
    private String text;
   public TextElement(String text){
       this.text=text;
   }
    public String  render(){
        return text;
    }
}
