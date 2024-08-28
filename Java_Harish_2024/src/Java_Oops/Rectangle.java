package Java_Oops;

public class Rectangle extends shape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    //inherited abstract method
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle with width: " + width + " and height: " + height);
    }
}
