package solidprinciples.liskovsubstitution.shape.goodsolution;

public class Square implements Shape{
    double side;
    public void setWidth(double s){
        this.side=s;
    }
    public void setHeight(double s){
        this.side=s;
    }
    public double getArea(){
        return side*side;
    }

}
