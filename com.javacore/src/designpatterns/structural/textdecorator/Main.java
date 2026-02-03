package designpatterns.structural.textdecorator;

public class Main {
    public static void main(String[] args) {
        Text text=new PlainText("hi");
        text=new ItalicDecorator(text);
        text=new UnderLineDecorator(text);
        System.out.println(text.render());
    }
}
