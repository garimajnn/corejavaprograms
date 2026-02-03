package designpatterns.structural.textdecorator;

public class TextDecorator implements Text{
    private Text text;
    public TextDecorator(Text obj){
        this.text=obj;
    }
    public String render(){
        return text.render();
    }
}
