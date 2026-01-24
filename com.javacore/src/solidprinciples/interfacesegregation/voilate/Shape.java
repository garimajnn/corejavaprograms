package solidprinciples.interfacesegregation.voilate;

interface  Shape {
    void area();
    void volume(); // 2D shapes dont have volume
}

class Square implements Shape{
    @Override
    public void area() {
        System.out.println("Area of square 4a2");
    }
    // Breaking of a LSP as well with ISP
    @Override
    public void volume() {
        return ;
    }

}
class Cube implements Shape{
    public void area(){
        System.out.println("cube area");
    }

    @Override
    public void volume() {
        System.out.println("cube volume");
    }
}

