package solidprinciples.liskovsubstitution.shape.badsolution;

public class Rectange {
    double height;
    double width;
    public Rectange(double h,double w){
        this.height=h;
        this.width=w;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }
    public double getArea(){
        return height*width;
    }
}
