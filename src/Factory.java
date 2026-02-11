interface shape{
    void draw();
}
class Circle implements shape{
    public void draw(){
        System.out.println("Circle");

    }
}
class Square implements shape{
    public void draw(){
        System.out.println("Square");

    }
}

public class Factory {
    public shape getshape(String ss){
        if(ss.equals("Circle")) {
            return new Circle();
        }
            return new Square();


    }
}