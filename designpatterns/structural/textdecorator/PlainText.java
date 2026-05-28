package designpatterns.structural.textdecorator;

public class PlainText implements Text{
    public String content;
    public  PlainText(String content){
        this.content=content;
    }
    public String render(){
        return this.content;
    }
}
