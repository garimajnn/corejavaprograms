package designpatterns.structural.textdecorator;

public class UnderLineDecorator extends TextDecorator{
    public UnderLineDecorator(Text text){
        super(text);
    }
    public String render(){
        return ("<u>"+ super.render() +"<u/>");
    }
}
