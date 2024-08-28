package Java_Oops;

//usage of abstract classes and its subclasses
public class Usage_abstract_C {

	 public static void main(String[] args) {
	        // Create instances of Circle and Rectangle
	        shape circle = new Circle(5.0);
	        shape rectangle = new Rectangle(4.0, 6.0);

	        // Call the draw method on each shape
	        circle.draw();        // Output: Drawing a circle with radius: 5.0
	        rectangle.draw();    // Output: Drawing a rectangle with width: 4.0 and height: 6.0

	        // Call the describe method on each shape
	        circle.describe();   // Output: This is a shape.
	        rectangle.describe(); // Output: This is a shape.
	    }
	}