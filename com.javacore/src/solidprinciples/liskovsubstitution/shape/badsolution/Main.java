package solidprinciples.liskovsubstitution.shape.badsolution;

public class Main {
    public static void main(String[] args) {
        Rectange rectange=new Square(2);
        rectange.setWidth(2);
        rectange.setHeight(5);
        rectange.getArea(); // expected 10 but got 25 // LSP breaks
    }
}
