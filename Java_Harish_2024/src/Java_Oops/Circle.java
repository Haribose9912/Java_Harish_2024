package Java_Oops;

public class Circle extends shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    
  //inherited abstract method
    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius: " + radius);
    }
}

