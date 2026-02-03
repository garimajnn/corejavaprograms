package solidprinciples.liskovsubstitution.shape.badsolution;

public class Square extends Rectange{

    double side;
    public Square(double side){
      super(side,side);
    }
    @Override
    public void setHeight(double height) {
        super.setHeight(height);
        super.setWidth(height);
    }
    public void setWidth(double width){
        super.setWidth(width);
        super.setHeight(width);
    }
    public double getArea(){
        return super.getArea();
    }
}
