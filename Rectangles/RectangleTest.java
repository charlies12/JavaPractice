package myShapes;

public class RectangleTest {

	public static void main(String[] args) {
		// This first rectangle is made with the default values of width = 1 and height = 1.
		Rectangle rectangle1 = new Rectangle(); // Has no arguments
		System.out.println("The area of rectangle with width " + rectangle1.width + " and height " + rectangle1.height + 
							" is " + rectangle1.getArea() + " units squared.");
		System.out.println("The perimeter is: " + rectangle1.getPerimeter() + " units."); // Perimeter
		
		//This rectangle has width = 4 and height = 40
		Rectangle rectangle2 = new Rectangle(4, 40);
		System.out.println("The area of rectangle with width " + rectangle2.width + " and height " + rectangle2.height + 
							" is " + rectangle2.getArea() + " units squared.");
		System.out.println("The perimeter is: " + rectangle2.getPerimeter() + " units.");
		
		//This rectangle has width 3.5 and height = 35.9
		Rectangle rectangle3 = new Rectangle(3.5, 35.9);
		System.out.println("The area of rectangle with width " + rectangle3.width + " and height " + rectangle3.height +
							" is " + rectangle3.getArea() + " units squared.");
		System.out.println("The perimeter is: " + rectangle3.getPerimeter() + " units.");

	}

}
