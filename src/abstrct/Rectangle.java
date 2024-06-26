package abstrct;

public class Rectangle extends Shape{

    private double length;
    private double width;

    public Rectangle(double length, double width){

    }
    @Override
    public double calculateArea() {
        return length * width;
    }
}
